package dataproviders;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DataProviderGroups {
	public WebDriver driver = null;

	@BeforeSuite(groups={"login","signup"})
	public void beforeSuite() {
		String exePath = System.getProperty("user.dir") + "//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://uat.circulus.io/");
		
	}

	// Verify the page title in Login page 
	@Test(dataProvider="groupData", dataProviderClass=DataProviderSource.class,groups={"login"})
	public void tc_Login_01(String username,String password) throws Exception {
		try {
			System.out.println("tc_Login_01: "+username+"---"+password);
			Reporter.log("Application has been successfully Launched.");
			String expectedTitle = "Circulus - Login";
			String actualTitle = driver.getTitle();
			System.out.println("Actual page title: " + actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Actual and Expected Page titles of Login page are Equal...");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	// Verify the validation messages when clicking on Submit button without entering user name and password
	@Test(dataProvider="groupData", dataProviderClass=DataProviderSource.class,groups={"login"})
	public void tc_Login_02(String username,String password) throws Exception {
		try {
			System.out.println("tc_Login_02: "+username+"---"+password);
			String expectedErrUserName = "Please enter Username / Email Address.";
			String expectedErrPassword = "Please enter Password.";

			driver.findElement(By.id("BtnLogin")).click();
			String actualErrUserName = driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
			String actualErrPassword = driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
			System.out.println("Actual validation message for User Name: " + actualErrUserName);
			System.out.println("Actual validation message for Password: " + actualErrPassword);
			Assert.assertEquals(expectedErrUserName, actualErrUserName);
			Assert.assertEquals(expectedErrPassword, actualErrPassword);
			System.out.println("Actual and Expected validation messages are Equal...");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	// Verify the page title in Sign Up page
	@Test(dataProvider="groupData", dataProviderClass=DataProviderSource.class,groups={"signup"})
	public void tc_Login_03(String firstName) throws Exception {
		try {
			Thread.sleep(2000);
			System.out.println("tc_Login_03 --> First Name: "+firstName);
			driver.findElement(By.linkText("Sign Up")).click();
			String expectedTitle = "Circulus - Registration";
			String actualTitle = driver.getTitle();
			System.out.println("Actual page title: " + actualTitle);
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("Actual and Expected Page titles of Sign Up page are Equal...");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	// Verify the validation messages when clicking on Register button without entering any data
	@Test(dataProvider="groupData", dataProviderClass=DataProviderSource.class,groups={"signup"})
	public void tc_Login_04(String firstName) throws Exception {
		try {
			System.out.println("tc_Login_04 --> First Name: "+firstName);
			driver.findElement(By.id("btnRegisterNow")).click();
			Thread.sleep(2000);
			String expectedErrFirstName = "Please enter First Name.";
			String actualErrFirstName = driver.findElement(By.xpath("//*[@id='pnlregister']/div[1]/div[2]/div")).getText();
			System.out.println("Actual validation message for First Name: " + actualErrFirstName);
			Assert.assertEquals(expectedErrFirstName, actualErrFirstName);
			System.out.println("Actual and Expected validation messages are Equal...");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@AfterSuite(groups={"login","signup"})
	public void afterSuite() {
		driver.quit();
	}
}
