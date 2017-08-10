package automation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownTest {
	static MasterDB master=null;
	public static void main(String[] args) throws IOException, SQLException, InterruptedException {
		master=new MasterDB();
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("selenium_commands"));
		Select options=new Select(element);
		options.selectByVisibleText("Browser Commands");
		options.selectByIndex(1);
		options.selectByVisibleText("Wait Commands");
		
		Thread.sleep(5000);
		//options.deselectAll();
		//options.deselectByIndex(1);
		//options.deselectByVisibleText("Wait Commands");
		
		//System.out.println(options.isMultiple());
		
		//To get First selected option
		System.out.println(options.getFirstSelectedOption().getText());
		
		//To get all the selected options
		List<WebElement> selected=options.getAllSelectedOptions();
		for(WebElement el:selected)
			System.out.println(el.getText());
		
	}

}
