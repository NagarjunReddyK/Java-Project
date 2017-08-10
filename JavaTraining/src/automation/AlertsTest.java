package automation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertsTest {
	static MasterDB master=null;
	public static void main(String[] args) throws IOException, SQLException, InterruptedException {
		master=new MasterDB();
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io");
		driver.manage().window().maximize();
		//To Login
		driver.findElement(By.id("TxtEmail")).sendKeys("emailid");
		driver.findElement(By.id("TxtPassword")).sendKeys("test@1234");
		driver.findElement(By.id("BtnLogin")).click();
		
		//To get the OTP from Database
		String otp=master.getOTP("emailid", "PortalLoginOTP");
	//	System.out.println(otp);
		driver.findElement(By.id("txtOTP")).sendKeys(otp);
		driver.findElement(By.id("BtnContinue")).click();
		driver.findElement(By.linkText("Client solutions")).click();
		/*//Example-1
		driver.findElement(By.id("cpBody_divqlbillsearch")).click();
		driver.findElement(By.id("cpBody_txtfrmamt")).sendKeys("100");
		driver.findElement(By.id("cpBody_txttoamt")).sendKeys("20");
		driver.findElement(By.id("cpBody_Btnsearch")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();*/
		
		//Example-2
		driver.findElement(By.id("cpBody_divqlbillentry")).click();
		driver.findElement(By.id("cpBody_btnBeginDEWithoutImg")).click();
		driver.findElement(By.id("cpBody_ddlAutoCompExt_txt_comb")).sendKeys("Cal Telephone");
		WebElement element=driver.findElement(By.id("cpBody_ddlAutoCompExt"));
		Select obj=new Select(element);
		obj.selectByVisibleText("Cal Telephone");
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		//alert.dismiss();
		alert.accept();
		
		/*//Handling Auto suggest/complete dropdown 
		driver.findElement(By.id("cpBody_ddlAutoCompExt_txt_comb")).sendKeys("ven");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='cpBody_ddlAutoCompExt_ul_comb']/li"));
		for(int i=0;i<list.size();i++){
			String exp="client vendor-01";
			String actual=list.get(i).getText();
			if(exp.equals(actual)){
				list.get(i).click();
				break;
			}
		}*/
		
		
		/*Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		//alert.dismiss();
		System.out.println(alert.getText());
		alert.accept();*/
	}

}
