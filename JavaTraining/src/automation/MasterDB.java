package automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MasterDB {
	static Properties prop=null;
	Connection con;
	public MasterDB() throws IOException, SQLException{
		FileInputStream db = new FileInputStream(System.getProperty("user.dir")+"//src//automation//Database.properties");
		prop=new Properties();
		prop.load(db);
		String connectionUrl=prop.getProperty("conMasterDB");
		DriverManager.registerDriver(new com.microsoft.jdbc.sqlserver.SQLServerDriver());
		con = DriverManager.getConnection(connectionUrl);
		
	}

	public String getOTP(String userName,String enterOTP) throws SQLException{
		String sqlOTP = "SELECT TOP 1 mLinkCode FROM mTblUserLinkExpiry ul "
				+ " JOIN mtblUser u ON ul.mUserId=u.mUserID "
				+ " WHERE u.mUserName=? AND ul.mLinkType=? AND ul.mIsActive=1 ORDER BY ul.mCreatedTimestamp DESC";
		PreparedStatement ps= con.prepareStatement(sqlOTP);
		ps.setString(1, userName);
		ps.setString(2, enterOTP);
		ResultSet rs=ps.executeQuery();
		String otp = null;
		while(rs.next()){
			otp=rs.getString("mLinkCode");
		}
		return otp;
	}
}
