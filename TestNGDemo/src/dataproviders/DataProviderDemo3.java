package dataproviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo3 {
	WebDriver driver;
	@BeforeClass
	public void openApp(){
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/");
	}
	
	@Test(dataProvider="getData")
    public void tc_Login_01(String username, String password) throws InterruptedException {
		driver.findElement(By.id("TxtEmail")).sendKeys(username);
		driver.findElement(By.id("TxtPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("TxtEmail")).clear();
		driver.findElement(By.id("TxtPassword")).clear();

    }
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
	
	@DataProvider
    public Object[][] getData() {
        return new Object[][]{{"nkasu@xtglobal.com","xeno@123$"}, {"billing@xeno.com","Test@123"},{"accounting@xeno.com","Abc@1234"}};
    }

}
