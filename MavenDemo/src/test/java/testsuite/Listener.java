package testsuite;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.LogStatus;

import base.Reusable;
import base.Setup;

public class Listener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		Setup.report.flush();
		Reusable.getDriver().quit();
	}

	@Override
	public void onStart(ITestContext arg0) {
		try {
			Setup.initialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String screenshot_path = Reusable.captureScreenshot(Reusable.getDriver(), result.getName());
		String image = Setup.logger.addScreenCapture(screenshot_path);
		Setup.logger.log(LogStatus.FAIL, "Test Case has been Failed", image);
		Setup.report.endTest(Setup.logger);
	}

	@Override
	public void onTestSkipped(ITestResult it) {
		System.out.println(it.getMethod().getMethodName() + ": Testcase has been skipped.");

	}

	@Override
	public void onTestStart(ITestResult it) {
		System.out.println(it.getMethod().getMethodName() + ": Testcase has been started.");

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		Setup.report.endTest(Setup.logger);
	}

}
