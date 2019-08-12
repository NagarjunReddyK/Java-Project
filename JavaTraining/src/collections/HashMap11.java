package collections;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMap11 {
	public static void main(String[] args) {
		By username=By.id("TxtEmail");
		By password=By.id("TxtPassword");
		By btnLogin=By.id("BtnLogin");
		
		
		
		Map<String, By> loginFields=new HashMap<String, By>();
		loginFields.put("username", username);
		loginFields.put("password", password);
		loginFields.put("btnLogin", btnLogin);
		
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/");
		
		
		for(Map.Entry<String, By> entry:loginFields.entrySet()){
			By element=loginFields.get(entry.getKey());
			if(driver.findElement(element).isDisplayed()){
				System.out.println(entry.getKey()+" is available on the screen.");
			}
			else{
				System.out.println(entry.getKey()+" is NOT available on the screen.");
			}
		}
	}

}
