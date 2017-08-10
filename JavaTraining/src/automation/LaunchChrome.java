package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	public static void main(String[] args) {
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();	
		
		//Maximizing browser window using maximize() method
		driver.manage().window().maximize();
		
		//Browser methods
		driver.get("http://qa.......");
		String title=driver.getTitle();
		System.out.println(title);
		
		String curUrl=driver.getCurrentUrl();
		System.out.println(curUrl);
		
		/*String source=driver.getPageSource();
		System.out.println(source);*/
		
	}
}
