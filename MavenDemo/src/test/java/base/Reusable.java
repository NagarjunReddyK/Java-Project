package base;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Reusable {
	public static WebDriver driver;

	public static void launchApp(String browser, String url) {
		System.out.println(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			String exePath = System.getProperty("user.dir") + "//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			String exePath = System.getProperty("user.dir") + "//IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", exePath);
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("nativeEvents", false);
			caps.setCapability("unexpectedAlertBehaviour", "accept");
			caps.setCapability("ignoreProtectedModeSettings", true);
			caps.setCapability("disable-popup-blocking", true);
			caps.setCapability("enablePersistentHover", true);
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver(caps);
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static String captureScreenshot(WebDriver driver, String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dest = System.getProperty("user.dir") + "//Screenshots//" + screenshotName + ".png";
			File destination = new File(dest);
			FileUtils.copyFile(source, destination);
			return dest;
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());
			return e.getMessage();
		}
	}

	public static WebElement getWebElement(String element) {
		WebElement el = null;
		String locatorType = element.split(":")[0];
		String locatorValue = element.split(":")[1];
		switch (locatorType) {
		case "id":
			el = driver.findElement(By.id(locatorValue));
			break;
		case "link":
			el = driver.findElement(By.linkText(locatorValue));
			break;
		case "xpath":
			el = driver.findElement(By.xpath(locatorValue));
			break;
		}
		return el;
	}

	public static void click(String element) {
		getWebElement(element).click();
	}

	public static String getText(String element) {
		return getWebElement(element).getText();
	}

	public static String getTitle() {
		return getDriver().getTitle();
	}
	public static void clear(String element){
		getWebElement(element).clear();
	}

	public static void delay(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

	public static void compareMessages(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}

	public static String getMethodName() {
		return new Exception().getStackTrace()[1].getMethodName();
	}

	public static WebElement waitUptoVisibilityOfElement() {
		return null;
	}

}
