package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
	public static void main(String[] args) {
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		//Navigation Methods
		driver.navigate().to("http://qa.....");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
