package basics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.screentaker.ViewportPastingStrategy;

public class ZohoScreen {
	WebDriver driver;
	@Test(priority=1)
	public void getScreenshot() throws IOException, InterruptedException{
		String path ="D:\\GitRepository\\CollectionsPractice\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.get("http://google.co.in");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.id("lst-ib")).sendKeys("Appium");
		 driver.findElement(By.name("btnG")).click();
		 Thread.sleep(2000);
		 Screenshot screen=new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(driver);
	        BufferedImage image = screen.getImage();
	        ImageIO.write(image, "PNG", new File("D:\\GitRepository\\"+ "Google_Entire.png"));
	        driver.quit();
	
		
	}

}
