package automation;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownload {
	public static void main(String[] args) throws Exception {
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		String downloadPath=System.getProperty("user.dir");
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("File Download")).click();
		Thread.sleep(5000);
		File file=new File(downloadPath+"/invoice.jpg");
		if(file.exists()){
			file.delete();
			System.out.println("File has been Deleted as it is already existed.");
		}
		Thread.sleep(5000);
		driver.findElement(By.linkText("invoice.jpg")).click();
		Thread.sleep(20000);
		if(file.exists()){
			System.out.println("File has been successfully downloaded.");
		}
		else{
			System.out.println("Failed to Download the File.");
			throw new Exception("Failed to Download the File.");
		}
	}

}
