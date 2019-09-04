package testsuite;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import base.Reusable;
import base.Setup;

public class SuiteBase {
	@BeforeSuite
	public void loadFiles() throws IOException{
		Setup.initialize();
	}
	@AfterMethod
	public void screenshot(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshot_path=Reusable.captureScreenshot(Reusable.getDriver(), result.getName());
			System.out.println(screenshot_path);
		}
	}
	@AfterClass
	public void tearDown(){
		Reusable.getDriver().quit();
	}

}
