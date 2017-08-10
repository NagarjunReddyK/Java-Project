package automation;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {
	public static void main(String[] args) {
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.....");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement element=driver.findElement(By.id("ddlState"));
		Select obj=new Select(element);
		obj.selectByVisibleText("TEXAS");
		//obj.selectByValue("51");
		//obj.selectByIndex(2);
		System.out.println(obj.getFirstSelectedOption().getText());
		List<WebElement> options= obj.getOptions();
		
		/*//Retrieving options using for-each loop
		for(WebElement el:options)
			System.out.println(el.getText());*/
		
		/*//Using for loop and get() method
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());
		}*/
		
		
		//Using ListIterator cursor
		/*ListIterator<WebElement> list=options.listIterator();
		while(list.hasNext()){
			System.out.println(list.next().getText());
		}*/
		
		
		//Using Iterator
		/*System.out.println("Retrieving options Using Iterator cursor");
		Iterator<WebElement> list=options.iterator();
		while(list.hasNext()){
			System.out.println(list.next().getText());
		}*/
		
	}

}
