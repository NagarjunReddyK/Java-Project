package testsuite;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener3 implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		String textMsg = "About to begin executing following method : " + returnMethodName(method.getTestMethod());
		Reporter.log(textMsg, true);
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		String textMsg = "Completed executing following method : " + returnMethodName(method.getTestMethod());
		Reporter.log(textMsg, true);
	}
	private String returnMethodName(ITestNGMethod method) {
		return method.getRealClass().getSimpleName() + "." + method.getMethodName();
	}

}
