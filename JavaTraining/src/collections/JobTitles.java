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

public class JobTitles {
	public static void main(String[] args) throws IOException {
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//locators.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText(prop.getProperty("signup"))).click();
		
		WebElement ddl=driver.findElement(By.id(prop.getProperty("jobtitle")));
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

}
