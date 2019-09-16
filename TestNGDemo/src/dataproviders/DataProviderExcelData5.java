package dataproviders;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelData5 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		String exePath = System.getProperty("user.dir") + "//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.circulus.io/");
	}

	@Test(dataProvider = "DataProviderIterator")
	public void tc_Login_01(Object[][] obj) throws InterruptedException {
		for (int row = 0; row < obj.length; row++) {
			driver.findElement(By.id("TxtEmail")).sendKeys(obj[row][1].toString());
			driver.findElement(By.id("TxtPassword")).sendKeys(obj[row][2].toString());
			driver.findElement(By.id("BtnLogin")).click();
			Thread.sleep(2000);
			String expectedMsg = "Invalid Username / Email Address or Password.";
			String expInvalidEmailMsg = "Please enter a valid Username / Email Address.";
			String expectedErrUserName = "Please enter Username / Email Address.";
			String expectedErrPassword = "Please enter Password.";

			switch (obj[row][3].toString()) {
			case "invuser":
				Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
				break;
			case "invpwd":
				Assert.assertEquals(expectedMsg, driver.findElement(By.id("divemail")).getText());
				break;
			case "invEmail":
				Assert.assertEquals(expInvalidEmailMsg,
						driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText());
				break;
			case "blank":
				String actualErrUserName = driver.findElement(By.xpath("//*[@id='Div1']/div[2]/div")).getText();
				String actualErrPassword = driver.findElement(By.xpath("//*[@id='Div1']/div[4]/div")).getText();
				Assert.assertEquals(expectedErrUserName, actualErrUserName);
				Assert.assertEquals(expectedErrPassword, actualErrPassword);
				System.out.println("Actual and Expected validation messages are Equal for blank credentials...");
				break;

			}

			Thread.sleep(2000);
			driver.findElement(By.id("TxtEmail")).clear();
			driver.findElement(By.id("TxtPassword")).clear();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "DataProviderIterator")
	public Iterator<Object[][]> loginDetails(Method method) throws IOException {
		List<Object[][]> list = new ArrayList<>();
		Excel_Reader xl = new Excel_Reader(System.getProperty("user.dir") + "//src//dataproviders//LoginExcel.xlsx");
		list.add(xl.getData("Sheet1", "TCID", method.getName()));
		return list.iterator();
	}

}
