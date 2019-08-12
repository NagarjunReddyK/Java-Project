package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PropertiesDemo2 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//locators.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
		
		getWebElement(prop.getProperty("signup")).click();
		WebElement ddl=getWebElement(prop.getProperty("jobtitle"));
		
		Select sel=new Select(ddl);
		List<WebElement> el=sel.getOptions();
		ArrayList<String> al=new ArrayList<>();
		for(int i=1;i<el.size();i++){
			al.add(el.get(i).getText());
		}
		
		for(String s:al){
			System.out.println(s);
		}
	}
	
	
	
	
	
	
	public static WebElement getWebElement(String locator){
		String locatorType = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];
		WebElement element=null;
		switch(locatorType){
		case "Id":
			element=driver.findElement(By.id(locatorValue));
			break;
		case "name":
			element=driver.findElement(By.name(locatorValue));
			break;
		case "css":
			element=driver.findElement(By.cssSelector(locatorValue));
			break;
		case "link":
			element=driver.findElement(By.linkText(locatorValue));
			break;
		case "xpath":
			element=driver.findElement(By.xpath(locatorValue));
			break;
		}
		return element;
	}

}
