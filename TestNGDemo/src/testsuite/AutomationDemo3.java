package testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Passing Browser parameter from TestNG xml and Mutli Browsers (browsers.xml)
public class AutomationDemo3 {
	public WebDriver driver;

	@Parameters({"browser","url"})
	@BeforeClass
	public void beforeClass(String browser,String url) {
		System.out.println(browser);
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			String exePath = System.getProperty("user.dir") + "//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			String exePath = System.getProperty("user.dir") + "//IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", exePath);
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("nativeEvents", false);
			caps.setCapability("unexpectedAlertBehaviour", "accept");
			caps.setCapability("ignoreProtectedModeSettings", true);
			caps.setCapability("disable-popup-blocking", true);
			caps.setCapability("enablePersistentHover", true);
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	// Verify the validation messages when clicking on Submit button without entering user name and password
	@Test
	public void tc_Login_01() throws Exception {
		try {
			String expectedErrUserName = "Please enter Username / Email Address.";
			String expectedErrPassword = "Please enter Password.";
			Thread.sleep(3000);

			driver.findElement(By.id("BtnLogin")).click();
			Thread.sleep(2000);
			String actualErrUserName = driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword = driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
			System.out.println("Actual validation message for User Name: " + actualErrUserName);
			System.out.println("Actual validation message for Password: " + actualErrPassword);
			Assert.assertEquals(expectedErrUserName, actualErrUserName);
			Assert.assertEquals(expectedErrPassword, actualErrPassword);
			System.out.println("Actual and Expected validation messages are Equal...");
		} catch (Exception e){
			throw new Exception(e.getMessage());
		}
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}

}
