package collections;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobTitles {
	public static void main(String[] args) {
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();	
		//Maximizing browser window using maximize() method
		driver.manage().window().maximize();
		driver.get("url of app");
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement ddl=driver.findElement(By.id("ddlJobTitle"));
		Select sel=new Select(ddl);
		List<WebElement> el=sel.getOptions();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<el.size();i++){
			al.add(el.get(i).getText());
			/*String str=el.get(i).getText();
			al.add(str);*/
		}
		
		for(String s:al){
			System.out.println(s);
		}
		
		
	}

}
