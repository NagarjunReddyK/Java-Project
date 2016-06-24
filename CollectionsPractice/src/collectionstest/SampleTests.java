package collectionstest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 


import base.RepositoryParser;
 
public class SampleTests {
 
	private RepositoryParser parser;
	private WebDriver driver;
 
	@BeforeClass
	public void setUp() throws IOException
	{
		String path ="D:\\GitRepository\\CollectionsPractice\\IEDriverServer_32bit.exe";
		System.setProperty("webdriver.ie.driver", path);
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		caps.setCapability("requireWindowFocus", true);
		caps.setCapability("enablePersistentHover", true);
		caps.setCapability("native events", true);
		driver=new InternetExplorerDriver(caps);
		driver.get("http://qa.xtbills.com");
		parser = new RepositoryParser("objectrepository.properties");
	}
 
	@Test
	public void login_01() throws InterruptedException
	{
		//Lets see how we can find the first name field
		WebElement email = driver.findElement(parser.getobjectLocator("txtEmail"));
		WebElement password = driver.findElement(parser.getobjectLocator("txtPassword"));
		WebElement login=driver.findElement(parser.getobjectLocator("btnSignin"));
		email.sendKeys("nkasu@xtglobal.com");
		password.sendKeys("*xeno1234*");
		Thread.sleep(2000);
		login.click();
	}
 
	@Test(enabled=false)
	public void FindPartialLink()
	{
		WebElement link = driver.findElement(parser.getobjectLocator("PartialLink"));
		link.click();
	}
 
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
 
}
