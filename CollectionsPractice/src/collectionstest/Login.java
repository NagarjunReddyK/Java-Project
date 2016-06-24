package collectionstest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login{
	
	public static WebDriver driver;
    static PageActions page;
	
	@BeforeClass
	public static void setUp() throws IOException{
		String path ="D:\\GitRepository\\CollectionsPractice\\IEDriverServer_32bit.exe";
		System.setProperty("webdriver.ie.driver", path);
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		caps.setCapability("requireWindowFocus", true);
		caps.setCapability("enablePersistentHover", true);
		caps.setCapability("native events", true);
		driver=new InternetExplorerDriver(caps);
		driver.get("http://qa.xtbills.com");
	}
	@Test
	public static void login_01() throws IOException{
		page=new PageActions();
		page.login("nkasu@xtglobal.com", "*xeno1234*");
	}
	

}
