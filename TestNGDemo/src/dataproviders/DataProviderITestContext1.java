package dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderITestContext1 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass(){
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/");
	}

	//Verify the page title in Login page
	@Test
	public void tc_Login_01() throws Exception{
		try{
			String expectedTitle="Circulus - Login";
			String actualTitle=driver.getTitle();
			System.out.println("Actual page title: "+actualTitle);
			Assert.assertEquals(expectedTitle, actualTitle);
			System.out.println("Actual and Expected Page titles are Equal...");
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}

	}
	//To verify the validation messages
	@Test(dataProvider="TestData",dataProviderClass=DataProviderSource.class)
	public void tc_Login_02(String username, String password, String flag) throws Exception {
		try{
			driver.findElement(By.id("TxtEmail")).sendKeys(username);
			driver.findElement(By.id("TxtPassword")).sendKeys(password);
			driver.findElement(By.id("BtnLogin")).click();
			Thread.sleep(2000);
			String expectedMsg="Invalid Username / Email Address or Password.";
			String expInvalidEmailMsg="Please enter a valid Username / Email Address.";
			String expectedErrUserName="Please enter Username / Email Address.";
			String expectedErrPassword="Please enter Password.";

			switch(flag){
			case "invuser":
				Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
				System.out.println("Actual and Expected validation messages are Equal for Invalid User...");
				break;
			case "invpwd":
				Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
				System.out.println("Actual and Expected validation messages are Equal for Invalid password...");
				break;
			case "invEmail":
				Assert.assertEquals(expInvalidEmailMsg, driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText());
				System.out.println("Actual and Expected validation messages are Equal for Invalid email...");
				break;
			case "blank":
				String actualErrUserName=driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
				String actualErrPassword=driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
				Assert.assertEquals(expectedErrUserName, actualErrUserName);
				Assert.assertEquals(expectedErrPassword, actualErrPassword);
				System.out.println("Actual and Expected validation messages are Equal for blank credentials...");
				break;
			}
			Thread.sleep(2000);
			driver.findElement(By.id("TxtEmail")).clear();
			driver.findElement(By.id("TxtPassword")).clear();
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
