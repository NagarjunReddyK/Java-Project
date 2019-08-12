package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//objectrepository.properties");
		Properties prop=new Properties();
		//load the properties file by using load() method of Properties class//
		prop.load(fis);
		//get the data from properties file by using getProperty()
		String username=prop.getProperty("txtUserName");
		String password=prop.getProperty("txtPassword");
		String btnSignin=prop.getProperty("btnSignin");
		
		System.out.println("User Name:"+username);
		System.out.println("Password:"+password);
		System.out.println("SignIn button:"+btnSignin);

	}
}
