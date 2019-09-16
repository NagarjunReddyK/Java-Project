package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Listener2.class)
public class ListenerTest {
	public WebDriver driver = null;

	@BeforeSuite
	public void beforeSuite() {
		String exePath = System.getProperty("user.dir") + "//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
		
	}

	// Verify the page title in Login page //@Test(retryAnalyzer=Listener4.class)
	@Test
	public void tc_Login_01() throws Exception {
		try {
			Reporter.log("Application has been successfully Launched.");
			String expectedTitle = "Circulus - Login..";
			String actualTitle = driver.getTitle();
			System.out.println("Actual page title: " + actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Actual and Expected Page titles are Equal...");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	// Verify the validation messages when clicking on Submit button without entering user name and password
	@Test
	public void tc_Login_02() throws Exception {
		try {
			String expectedErrUserName = "Please enter Username / Email Address.";
			String expectedErrPassword = "Please enter Password..";

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
	@Test
	public void tc_Login_03() throws Exception {
		try {
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign Up")).click();
			String expectedTitle = "Circulus - Registration";
			String actualTitle = driver.getTitle();
			System.out.println("Actual page title: " + actualTitle);
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("Actual and Expected Page titles are Equal...");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	// Verify the validation messages when clicking on Register button without entering any data
	@Test
	public void tc_Login_04() throws Exception {
		try {
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

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
