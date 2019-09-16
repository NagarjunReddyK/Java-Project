package dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderITestContext2 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass(){
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
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
	@Test(dataProvider="TestData",dataProviderClass=DataProviderSource.class)
	public void tc_SignUp_02(String firstName, String lastName, String email) throws Exception {
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("txtFirstName")).sendKeys(firstName);
			driver.findElement(By.id("txtLastName")).sendKeys(lastName);
			driver.findElement(By.id("txtEmail")).sendKeys(email);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign In")).click();
			driver.findElement(By.linkText("Sign Up")).click();
			System.out.println(firstName+", "+lastName+", "+email+" have been entered in Sign Up page.");

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
