package testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Reusable;
import base.Setup;

public class AutomationDemo4 extends SuiteBase {
	@BeforeClass
	@Parameters({"browser","url"})
	public void beforeClass(String browser, String url) {
		Reusable.launchApp(browser,url);
	}

	// Verify the page title in Sign Up page
	@Test
	public void tc_SignUp_01() throws Exception {
		try {
			Reusable.click(Setup.prop.getProperty("lnkSignUp"));
			Thread.sleep(2000);
			String expectedTitle = Setup.prop.getProperty("expSignUpPageTitle");
			String actualTitle = Reusable.getDriver().getTitle();
			System.out.println("Actual page title: " + actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Actual and Expected Page titles of Sign Up page are Equal...");
		}catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	// Verify the validation messages when clicking on Register button without entering any data
	@Test
	public void tc_SignUp_02() throws Exception {
		try {
			Reusable.click(Setup.prop.getProperty("btnRegister"));
			Thread.sleep(2000);
			String expectedErrFirstName = Setup.prop.getProperty("expErrFirstName");
			String actualErrFirstName = Reusable.getText(Setup.prop.getProperty("errFirstName"));
			System.out.println("Actual validation message for First Name: " + actualErrFirstName);
			Assert.assertEquals(expectedErrFirstName, actualErrFirstName);
			System.out.println("Actual and Expected validation messages are Equal...");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	// Verify the page title in Login page
	@Test
	public void tc_SignUp_03() throws Exception{
		try{
			Reusable.click(Setup.prop.getProperty("lnkSignIn"));
			Thread.sleep(2000);
			String expectedTitle = Setup.prop.getProperty("expSignInPageTitle");
			String actualTitle = Reusable.getDriver().getTitle();
			System.out.println("Actual page title: " + actualTitle);
			Assert.assertEquals(actualTitle, expectedTitle);
			System.out.println("Actual and Expected Page titles of Login page are Equal...");
		}
		catch(Exception e){
			throw new Exception(e.getMessage());
		}
	}

}
