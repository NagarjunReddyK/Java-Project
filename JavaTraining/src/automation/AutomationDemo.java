package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemo {
	public static void main(String[] args) {
		String exePath=System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://qa.circulus.io");
		
		driver.navigate().to("http://qa.circulus.io");
		/*driver.findElement(By.id("TxtEmail")).sendKeys("emailid");
		driver.findElement(By.id("TxtPassword")).sendKeys("test@1234");*/
		
		/*driver.findElement(By.id("BtnLogin")).click();
		//System.out.println(driver.findElement(By.id("BtnContinue")).isEnabled());
		String msg=driver.findElement(By.id("divemail")).getText();
		System.out.println(msg);*/
		driver.findElement(By.linkText("Sign Up")).click();
		
		//driver.findElement(By.partialLinkText("Sign")).click();
		//driver.findElement(By.xpath("//div[@id='pnlregister']/div[4]/div/div/div/a")).click();
		
		WebElement element=driver.findElement(By.id("ddlState"));
		Select sel=new Select(element);
		//sel.selectByIndex(2);
		//sel.selectByVisibleText("FLORIDA");
		//sel.selectByValue("5");
		List<WebElement> list=sel.getOptions();
		
		for(WebElement el:list){
			System.out.println(el.getText());
		}
		
		for(int i=0;i<list.size();i++){
			list.get(i).getText();
		}
		
		
	}

}
