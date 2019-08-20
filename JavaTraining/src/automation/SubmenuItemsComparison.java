package automation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import comparison.ArrayListCompare;

public class SubmenuItemsComparison {
	static MasterDB master=null;
	static WebDriver driver =null;
	ArrayList<String> unmatched=null;
	
	///public static void main(String[] args) throws SQLException, IOException, InterruptedException {
	@Test
	public void tc_SubmenuItems_01() throws Exception{
		try{
			master=new MasterDB();
			String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();	
			//Maximizing browser window using maximize() method
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("url");
			//To Login
			driver.findElement(By.id("TxtEmail")).sendKeys("email");
			driver.findElement(By.id("TxtPassword")).sendKeys("pwd");
			driver.findElement(By.id("BtnLogin")).click();
			//To get the OTP from Database
			String otp=master.getOTP("email", "PortalLoginOTP");
			driver.findElement(By.id("txtOTP")).sendKeys(otp);
			driver.findElement(By.id("BtnContinue")).click();
			//To click on Company Name
			driver.findElement(By.linkText("Retail R26.5")).click();
			Thread.sleep(5000);
			//mouseHover(driver.findElement(By.xpath("//a[@id='menu_aBills']")));
			driver.findElement(By.xpath("//a[@id='menu_aBills']")).click();
					
			//Parsing string by comma separate and store individual items into ArrayList object.
			String exp="Add Bill, Enter Bill Data, Approve Bills, Pay Bills, My Recurring Bills, Add Recurring Bill, Search Bills, Bill Inbox";
			ArrayList<String> expectedItems=getOptions(exp);
			System.out.println("Expected Submenu Items: "+expectedItems);
			
			//To retrieve actual sub menu items from the application
			ArrayList<String> actualItems=new ArrayList<String>();
			List<WebElement> submenus=driver.findElements(By.xpath("//div[@class='sticky-menu']//li[1]//ul[1]//li"));
			System.out.println("Submenu Items Size: "+submenus.size());
			for(int i=1;i<=submenus.size();i++){
				actualItems.add(driver.findElement(By.xpath("//div[@class='sticky-menu']//li[1]//ul[1]//li["+i+"]//a")).getText());
			}
			System.out.println("Actual Submenu Items: "+actualItems);
			
			//Comparing both actual and expected ArrayLists
			unmatched=ArrayListCompare.compareLists(expectedItems, actualItems);
			if(unmatched.size()>0){
				System.out.println("Unmatched Submenus: "+unmatched);
				throw new Exception("Unmatched Submenus: "+unmatched);
			}
			else
				System.out.println("All the Actual and Expected Submenus are Equal.");
		}
		catch(Exception e){
			throw new Exception("Unmatched Submenus: "+unmatched);
		}
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	// To convert string with comma separated as ArrayList
		public ArrayList<String> getOptions(String str) {
			ArrayList<String> options = new ArrayList<String>(Arrays.asList(str.split("\\s*,\\s*")));
			return options;
		}
	
}
