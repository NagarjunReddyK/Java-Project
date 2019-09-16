package dataproviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class StaticDataProviderDemo2 {
	WebDriver driver;
	
	@Test(dataProvider="client2", dataProviderClass=DataProviderSource.class)
	public void tc_Login_01(String browser){
		if(browser.equalsIgnoreCase("chrome")){	
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("ie")){
			String exePath = System.getProperty("user.dir") + "//IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", exePath);
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("nativeEvents", false);
			driver = new InternetExplorerDriver(caps);
		}
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/");
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
