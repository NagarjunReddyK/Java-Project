package testsuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Reusable;
import base.Setup;
import pageactions.LoginPageActions;
import pageactions.VendorPageActions;
import testdata.Vendors;

public class CreateVendorsTest {
	public LoginPageActions loginActions;
	public VendorPageActions vendorActions;
	@Parameters({ "browser", "url", "username", "password" })
	@Test
	public void tc_CreateVendor_01(String browser, String url, String username, String password) throws Exception {
		Setup.logger = Setup.report.startTest(Reusable.getMethodName(),"Verify that user is able to login to the Application and Navigate to Add Vendor page");
		Setup.logger.assignCategory("Create Vendor");
		Reusable.launchApp(browser, url);
		loginActions = new LoginPageActions();
		loginActions.login(username, password);
		vendorActions = new VendorPageActions();
		vendorActions.navigateToAddVendor();
		Reusable.compareMessages(Reusable.getTitle(), Setup.login.getProperty("titleAddVendor"));
		Setup.logger.log(LogStatus.PASS, "Actual and Expected page titles of Add Vendor page are equal.");
		System.out.println("Actual and Expected page titles of Add Vendor page are equal.");
	}

	@Test(dataProvider = "getVendorData")
	public void tc_CreateVendor_02(Vendors v) throws InterruptedException {
		Setup.logger = Setup.report.startTest(Reusable.getMethodName(),"Verify that Vendors are created with data parameterized by Data Provider ");
		Setup.logger.assignCategory("Create Vendor");
		Reusable.delay(2);
		Reusable.getWebElement(Setup.login.getProperty("txtVendorName")).sendKeys(v.vendorName);
		Reusable.getWebElement(Setup.login.getProperty("txtEmail")).sendKeys(v.email);
		Reusable.getWebElement(Setup.login.getProperty("txtStreet")).sendKeys(v.street);
		Reusable.getWebElement(Setup.login.getProperty("txtCity")).sendKeys(v.city);
		Reusable.getWebElement(Setup.login.getProperty("txtState")).sendKeys(v.state);
		Reusable.getWebElement(Setup.login.getProperty("txtZip")).sendKeys(v.zip);
		Reusable.click(Setup.login.getProperty("btnSave"));
		Reusable.compareMessages(vendorActions.getSuccessMessage(), Setup.login.getProperty("msgExpVendorCreated"));
		Setup.logger.log(LogStatus.INFO, v.vendorName + " has been successfully created.");
		System.out.println(v.vendorName + " has been successfully created.");

	}
	@DataProvider
	public Object[][] getVendorData(){
		return new Object[][]{{new Vendors("tc_CreateVendor_02","Circulus,LLC-10","qa@circulus.io","2407 parkway","Dallas","TX","75092")},
			{new Vendors("tc_CreateVendor_02","Circulus,LLC-11","qa@circulus.io","1500 parkway","Plano","TX","75093")},
			{new Vendors("tc_CreateVendor_02","Circulus,LLC-12","qa@circulus.io","1234 parkway","Dallas","TX","75092")}};
	}

}
