package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {
	public static Properties prop=null;
	public static void initialize() throws IOException{
		try{
			//To load objectrepository.properties file
			FileInputStream obj=new FileInputStream(System.getProperty("user.dir")+"//src//configuration//objectrepository.properties");
			prop=new Properties();
			prop.load(obj);
			System.out.println("objectrepository properties file has been successfully loaded.");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
