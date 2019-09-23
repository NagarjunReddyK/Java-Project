package testsuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Reusable;
import base.Setup;
import pageactions.LoginPageActions;
import pageactions.VendorPageActions;

public class SignUpTest {
	public LoginPageActions loginActions;
	public VendorPageActions vendorActions;
	
	@Parameters({ "browser", "url"})
	@Test
	public void tc_SignUp_01(String browser, String url) throws Exception {
		Setup.logger = Setup.report.startTest(Reusable.getMethodName(),"Verify that Application is Launched");
		Setup.logger.assignCategory("SignUp");
		loginActions = new LoginPageActions();
		Reusable.launchApp(browser, url);
		Reusable.compareMessages(Reusable.getTitle(), Setup.login.getProperty("expSignInPageTitle"));
		Setup.logger.log(LogStatus.PASS, "Actual and Expected page titles of Login page are equal.");
		Setup.log.info(Reusable.getMethodName()+": Actual and Expected page titles of Login page are equal.");
		System.out.println("Actual and Expected page titles of Login page are equal.");
	}
	@Test
	public void tc_SignUp_02() throws Exception {
		Setup.logger = Setup.report.startTest(Reusable.getMethodName(),"Verify the page title of Sign Up page");
		Setup.logger.assignCategory("SignUp");
		loginActions.navigateToSignUpPage();
		Reusable.compareMessages(Reusable.getTitle(), Setup.login.getProperty("expSignUpPageTitle"));
		Setup.logger.log(LogStatus.PASS, "Actual and Expected page titles of Sign Up page are equal.");
		Setup.log.info(Reusable.getMethodName()+": Actual and Expected page titles of Sign Up page are equal.");
		System.out.println("Actual and Expected page titles of Sign Up page are equal.");
	}
	@Test
	public void tc_SignUp_03() throws Exception {
		Setup.logger = Setup.report.startTest(Reusable.getMethodName(),"Verify the validation messages upon clicking Register button without entering any data");
		Setup.logger.assignCategory("SignUp");
		loginActions.clickRegister();
		Reusable.compareMessages(Reusable.getText(Setup.login.getProperty("errFirstName")), Setup.login.getProperty("expErrFirstName"));
		Setup.logger.log(LogStatus.PASS, "Actual and Expected validation messages are equal.");
		Setup.log.info(Reusable.getMethodName()+": Actual and Expected validation messages are equal.");
		System.out.println("Actual and Expected validation messages are equal.");
	}

}
