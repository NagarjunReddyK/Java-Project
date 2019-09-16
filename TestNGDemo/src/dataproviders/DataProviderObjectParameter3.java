package dataproviders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderObjectParameter3 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass(){
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/");
	}
	
	@Test(dataProvider="credentials")
    public void tc_Login_01(Map<String,String> map) throws InterruptedException {
		driver.findElement(By.id("TxtEmail")).sendKeys(map.get("username"));
		driver.findElement(By.id("TxtPassword")).sendKeys(map.get("password"));
		driver.findElement(By.id("BtnLogin")).click();
		Thread.sleep(2000);
		String expectedMsg="Invalid Username / Email Address or Password.";
		String expInvalidEmailMsg="Please enter a valid Username / Email Address.";
		String expectedErrUserName="Please enter Username / Email Address.";
		String expectedErrPassword="Please enter Password.";
		
		switch(map.get("flag")){
		case "invuser":
			Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid User...");
			break;
		case "invpwd":
			Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid Password...");
			break;
		case "invEmail":
			Assert.assertEquals(expInvalidEmailMsg, driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText());
			System.out.println("Actual and Expected validation messages are Equal for Invalid Email...");
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
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	@DataProvider(name="credentials")
	public Iterator<Object[]> getCredentials(){
		Map<String,String> map1=new HashMap<>();
		map1.put("username", "nkasu@xtglobal.com");
		map1.put("password", "Test@1234");
		map1.put("flag", "invpwd");
		
		Map<String,String> map2=new HashMap<>();
		map2.put("username", "nagarjun@yahoo.com");
		map2.put("password", "Asdf!$123");
		map2.put("flag", "invuser");
		
		List<Map<String,String>> list=new ArrayList<>();
		list.add(map1);
		list.add(map2);
		
		List<Object[]> dp=new ArrayList<>();
		for(Map<String,String> map:list){
			dp.add(new Object[]{map});
		}
		return dp.iterator();
	}

}
