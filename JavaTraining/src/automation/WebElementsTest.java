package automation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest {
	static MasterDB master=null;
	public static void main(String[] args) throws IOException, SQLException, InterruptedException {
		master=new MasterDB();
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("application url");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("TxtEmail")).sendKeys("emailid");
		driver.findElement(By.id("TxtPassword")).sendKeys("test@1234");
		driver.findElement(By.id("BtnLogin")).click();
		
		
		System.out.println("Before entering OTP: "+driver.findElement(By.id("BtnContinue")).isEnabled());
		//To get the OTP from Database
		String otp=master.getOTP("emailid", "PortalLoginOTP");
		System.out.println(otp);
		driver.findElement(By.id("txtOTP")).sendKeys(otp);
		System.out.println("After entering OTP: "+driver.findElement(By.id("BtnContinue")).isEnabled());
		driver.findElement(By.id("BtnContinue")).click();
		
		
		/*//Links with linkText methods
		driver.findElement(By.linkText("Sign Up")).click();	
		driver.findElement(By.partialLinkText("Sign")).click();*/
		
		/*//Check box
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement chkBox=driver.findElement(By.xpath("//div[@id='pnlregister']/div[4]/div/div/div/a"));
		chkBox.click();
		Thread.sleep(2000);
		WebElement chk=driver.findElement(By.id("chkSameAboove"));
		System.out.println(chk.isSelected());
		if(chk.isSelected()){
			System.out.println("Check box Selected.");
			chkBox.click();
		}*/
		
		/*//Radio buttons
		driver.findElement(By.linkText("Client solutions")).click();
		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_alnk")).click(); //Company Settings link in Dashboard
		driver.findElement(By.xpath("//div[@id='a']/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div/a")).click();
		boolean isSelected=driver.findElement(By.id("cpBody_rdbVenRevApprove")).isSelected();
		System.out.println(isSelected);
		Thread.sleep(3000);
		if(isSelected)
			driver.findElement(By.xpath("//div[@id='a']/div[1]/div[2]/table/tbody/tr[2]/td[2]/div/div/a")).click();*/
		
		/*//using findElements with name attribute having same values for both radio buttons
		driver.findElement(By.linkText("Client solutions")).click();
		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_alnk")).click();
		List<WebElement> list=driver.findElements(By.name("ctl00$cpBody$disabledTrigger"));
		boolean isSelected=list.get(1).isSelected();
		System.out.println(isSelected);
		Thread.sleep(3000);
		if(isSelected)
			driver.findElement(By.xpath("//div[@id='a']/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div/a")).click();*/
		
		
		
			
		
		
	}

}
