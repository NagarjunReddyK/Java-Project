package testsuite;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Reusable;
import base.Setup;
import pageactions.LoginPageActions;
import pageactions.VendorPageActions;
import testdata.Vendors;

public class CreateVendorsTest_TBD {
	public LoginPageActions loginActions;
	public VendorPageActions vendorActions;

	@BeforeClass
	public void onStart(ITestContext arg0) {
		try {
			Setup.initialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public void onFinish(ITestContext arg0) {
		Setup.report.flush();
		Reusable.getDriver().quit();
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshot_path = Reusable.captureScreenshot(Reusable.getDriver(), result.getName());
			String image = Setup.logger.addScreenCapture(screenshot_path);
			Setup.logger.log(LogStatus.FAIL, "Testcase Failed", image);
		}
		Setup.report.endTest(Setup.logger);
	}

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
		try {
			System.out.println("VendorName: " + v.vendorName);
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
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@DataProvider
	public Iterator<Vendors> getVendorData(Method method) throws IOException {
		List<Vendors> list = new ArrayList<>();
		list.addAll(Setup.xlVendors.getVendorExcelData("Sheet1", "TCID", method.getName()));
		for (Vendors vc : list)
			System.out.println(vc.tcid + vc.vendorName + vc.email + vc.street + vc.city + vc.state + vc.zip);
		return list.iterator();
	}

}
