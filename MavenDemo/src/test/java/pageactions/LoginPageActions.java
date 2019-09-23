package pageactions;

import base.MasterDB;
import base.Reusable;
import base.Setup;

public class LoginPageActions {
	static MasterDB master = null;

	public void login(String username, String password) throws Exception {
		try {
			master = new MasterDB();
			Reusable.getWebElement(Setup.login.getProperty("txtUserName")).sendKeys(username);
			Reusable.getWebElement(Setup.login.getProperty("txtPassword")).sendKeys(password);
			Reusable.click(Setup.login.getProperty("btnSignIn"));
			String otp = master.getOTP("nkasu@xtglobal.com", "PortalLoginOTP");
			Reusable.delay(2);
			Reusable.getWebElement(Setup.login.getProperty("txtOTP")).sendKeys(otp);
			Reusable.click(Setup.login.getProperty("btnContinue"));
			Reusable.delay(2);
			Reusable.click(Setup.login.getProperty("lnkCompanyName"));
			Reusable.delay(2);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public void validateLogin(String username, String password) throws Exception {
		try {
			Reusable.getWebElement(Setup.login.getProperty("txtUserName")).sendKeys(username);
			Reusable.getWebElement(Setup.login.getProperty("txtPassword")).sendKeys(password);
			Reusable.click(Setup.login.getProperty("btnSignIn"));
			Reusable.delay(2);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void navigateToSignUpPage() throws InterruptedException{
		Reusable.getWebElement(Setup.login.getProperty("lnkSignUp")).click();
		Reusable.delay(2);
	}
	public void clickRegister() throws InterruptedException{
		Reusable.click(Setup.login.getProperty("btnRegister"));
		Reusable.delay(2);
	}

}
