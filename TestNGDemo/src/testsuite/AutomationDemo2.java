package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationDemo2 {
	static WebDriver driver = null;
	@BeforeClass
	public void beforeClass() {
		String exePath = System.getProperty("user.dir") + "//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
	}

	// Verify the page title in Sign Up page
	@Test
	public void tc_SignUp_01() throws Exception {
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
	public void tc_SignUp_02() throws Exception {
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
	@AfterClass
	public void afterSuite(){
		driver.quit();
	}

}
