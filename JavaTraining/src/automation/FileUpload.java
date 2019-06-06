package automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws IOException, InterruptedException {
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("File Upload")).click();
		driver.findElement(By.id("file-upload")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\billupload.exe");
		Thread.sleep(5000);
		driver.findElement(By.id("file-submit")).click();
		System.out.println("File has been successfully uploaded...");
	}

}
