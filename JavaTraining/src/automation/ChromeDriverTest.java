package automation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {
	static MasterDB master=null;
	public static void main(String[] args) throws SQLException, IOException, InterruptedException {
		master=new MasterDB();
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();	
		//Maximizing browser window using maximize() method
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*driver.get("http://qa.circulus.io");
		//To Login
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@xtglobal.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();
		//To get the OTP from Database
		String otp=master.getOTP("nkasu@xtglobal.com", "PortalLoginOTP");
		driver.findElement(By.id("txtOTP")).sendKeys(otp);
		driver.findElement(By.id("BtnContinue")).click();
		//To click on Company Name
		driver.findElement(By.linkText("Retail R26.5")).click();
		driver.findElement(By.id("cpBody_divqlbillpayments")).click();
		driver.findElement(By.id("cpBody_btnPay")).click();*/
		
		driver.get("http://toolsqa.com/iframe-practice-page/");
		//By executing a java script
		 JavascriptExecutor exe = (JavascriptExecutor) driver;
		 Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		 System.out.println("Number of iframes on the page are " + numberOfFrames);
		 
		 //By finding all the web elements using iframe tag
		 List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		 System.out.println("The total number of iframes are " + iframeElements.size());
		 
		 JavascriptExecutor je = (JavascriptExecutor) driver;
		 je.executeScript("document.getElementById('IF1').scrollIntoView(true);");
		 
		 driver.switchTo().frame("iframe1");
		 driver.findElement(By.name("firstname")).sendKeys("nagarjunreddy");
		 driver.findElement(By.name("lastname")).sendKeys("testing");
		// driver.findElement(By.linkText("Link Test")).click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("TUTORIAL")).click();
		 Thread.sleep(2000);
		 driver.quit();

	}

}
