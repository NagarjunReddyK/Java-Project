package testsuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import base.Reusable;
import base.Setup;
import pageactions.LoginPageActions;
import pageactions.VendorPageActions;

public class LoginTest1 {
	public LoginPageActions loginActions;
	public VendorPageActions vendorActions;
	
	@Parameters({ "browser", "url"})
	@Test
	public void tc_Login_01(String browser, String url) throws Exception {
		Setup.logger = Setup.report.startTest(Reusable.getMethodName(),"Verify that Application is Launched");
		Setup.logger.assignCategory("Login");
		loginActions = new LoginPageActions();
		Reusable.launchApp(browser, url);
	
		Reusable.compareMessages(Reusable.getTitle(), Setup.login.getProperty("expSignInPageTitle"));
		Setup.logger.log(LogStatus.PASS, "Actual and Expected page titles of Login page are equal.");
		Setup.log.info(Reusable.getMethodName()+": Actual and Expected page titles of Login page are equal.");
		System.out.println("Actual and Expected page titles of Login page are equal.");
	}
	
	@Test(dataProvider="getData")
	public void tc_Login_02(String username, String password,String flag) throws Exception{
		Setup.logger = Setup.report.startTest(Reusable.getMethodName(),"Verify that all Login validation messages are displayed");
		Setup.logger.assignCategory("Login");
		
		loginActions.validateLogin(username, password);
		
		switch(flag){
		case "invuser":
			Reusable.compareMessages(Reusable.getText(Setup.login.getProperty("actualInvMsg")), Setup.login.getProperty("expectedInvMsg"));
			System.out.println("Actual and Expected validation messages are Equal for Invalid User...");
			Setup.logger.log(LogStatus.PASS, "Actual and Expected validation messages are Equal for Invalid User...");
			Setup.log.info(Reusable.getMethodName()+": Actual and Expected validation messages are Equal for Invalid User...");
			break;
		case "invpwd":
			Reusable.compareMessages(Reusable.getText(Setup.login.getProperty("actualInvMsg")), Setup.login.getProperty("expectedInvMsg"));
			System.out.println("Actual and Expected validation messages are Equal for Invalid Password...");
			Setup.logger.log(LogStatus.PASS, "Actual and Expected validation messages are Equal for Invalid Password...");
			Setup.log.info(Reusable.getMethodName()+": Actual and Expected validation messages are Equal for Invalid Password...");
			break;
		case "invEmail":
			Reusable.compareMessages(Reusable.getText(Setup.login.getProperty("actualInvEmailMsg")), Setup.login.getProperty("expInvalidEmailMsg"));
			System.out.println("Actual and Expected validation messages are Equal for Invalid Email format...");
			Setup.logger.log(LogStatus.PASS, "Actual and Expected validation messages are Equal for Invalid Email format...");
			Setup.log.info(Reusable.getMethodName()+": Actual and Expected validation messages are Equal for Invalid Email format...");
			break;
		case "blank":
			String actualErrUserName=Reusable.getText(Setup.login.getProperty("actualErrUserName"));
			String actualErrPassword=Reusable.getText(Setup.login.getProperty("actualErrPassword"));
			Reusable.compareMessages(actualErrUserName, Setup.login.getProperty("expectedErrUserName"));
			Reusable.compareMessages(actualErrPassword, Setup.login.getProperty("expectedErrPassword"));
			System.out.println("Actual and Expected validation messages are Equal for blank credentials...");
			Setup.logger.log(LogStatus.PASS, "Actual and Expected validation messages are Equal for blank credentials...");
			Setup.log.info(Reusable.getMethodName()+": Actual and Expected validation messages are Equal for blank credentials...");
			break;
			
		}
		Thread.sleep(2000);
		Reusable.clear(Setup.login.getProperty("txtUserName"));
		Reusable.clear(Setup.login.getProperty("txtPassword"));
		

	}
	
	@DataProvider
    public Object[][] getData() {
        return new Object[][]{{"nkasu@xtglobal.com","xeno@123$","invpwd"}, {"fisr29@xeno.com","Test@123","invuser"},
        	{"fisbilling","Abc@1234","invEmail"},{"","","blank"}};
    }

}
