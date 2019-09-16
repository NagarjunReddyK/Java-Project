package testsuite;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class Listener2 implements IReporter,ISuiteListener {
	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		System.out.println("*****Custom Report******");
		// Iterating over each suite included in the test
		for (ISuite suite : suites) {
			// Following code gets the suite name
			String suiteName = suite.getName();
			// Getting the results for the said suite
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			for (ISuiteResult sr : suiteResults.values()) {
				ITestContext tc = sr.getTestContext();
				System.out.println("Passed tests for suite '" + suiteName + "' is:" + tc.getPassedTests().getAllResults().size());
				System.out.println("Failed tests for suite '" + suiteName + "' is:" + tc.getFailedTests().getAllResults().size());
				System.out.println("Skipped tests for suite '" + suiteName + "' is:"+ tc.getSkippedTests().getAllResults().size());
				
				Collection<ITestNGMethod> c=tc.getFailedTests().getAllMethods();
				Iterator<ITestNGMethod> itr=c.iterator();
				while(itr.hasNext()){
					System.out.println(itr.next().getQualifiedName());
				}
			}
		}
		System.out.println("*****End of Report******");
	}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("About to begin executing Suite " + suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Completed executing following suite: " + suite.getName());
	}
}
