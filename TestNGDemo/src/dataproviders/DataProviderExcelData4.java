package dataproviders;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelData4 {
	WebDriver driver;
	static MasterDB master=null;
	@BeforeClass
	public void beforeClass() throws IOException, SQLException{
		master=new MasterDB();
		String exePath = System.getProperty("user.dir")+"//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa.circulus.io/");
	}
	@Test(priority=1)
	public void tc_Login() throws SQLException, InterruptedException{
		driver.findElement(By.id("TxtEmail")).sendKeys("nkasu@xtglobal.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@1234");
		driver.findElement(By.id("BtnLogin")).click();
		//To get the OTP from Database
		String otp=master.getOTP("nkasu@xtglobal.com", "PortalLoginOTP");
		Thread.sleep(2000);
		driver.findElement(By.id("txtOTP")).sendKeys(otp);
		driver.findElement(By.id("BtnContinue")).click();
		//To click on Company Name
		driver.findElement(By.linkText("Retail R26.5")).click();
		Thread.sleep(3000);
	}
	@Test(priority=2,dataProvider="vendors")
	public void tc_CreateVendor(String TCID,String vendorName,String email, String street, String city, String state, String zip) throws InterruptedException{
		driver.findElement(By.xpath("//a[@id='menu_aVendors']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_aSearchVendor")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("cpBody_aAddVendor")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("cpBody_userNewVendor_cVtxtVendorName")).sendKeys(vendorName);
		driver.findElement(By.id("cpBody_userNewVendor_cVtxtEmail")).sendKeys(email);
		driver.findElement(By.id("cpBody_userNewVendor_cVtxtStreet")).sendKeys(street);
		driver.findElement(By.id("cpBody_userNewVendor_cVtxtCity")).sendKeys(city);
		driver.findElement(By.id("cpBody_userNewVendor_cVtxtState")).sendKeys(state);
		driver.findElement(By.id("cpBody_userNewVendor_cVtxtZip")).sendKeys(zip);
		Thread.sleep(2000);
		driver.findElement(By.id("cpBody_userNewVendor_cVbtnSubmit")).click();
		Thread.sleep(1000);
		Assert.assertEquals("Vendor has been successfully created.", driver.findElement(By.id("cpBody_userNewVendor_cVmsgdiv")).getText());
		System.out.println(vendorName+" has been successfully created.");
		
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

	@DataProvider(name="vendors")
	public Object[][] getExcelData(Method method) throws IOException
	{
		Excel_Reader xl=new Excel_Reader(System.getProperty("user.dir")+"//src//dataproviders//Vendors.xlsx");
		return xl.getData("Sheet1", "TCID", method.getName());
	}

}
