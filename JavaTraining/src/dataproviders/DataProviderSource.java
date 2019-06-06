package dataproviders;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;


public class DataProviderSource {
	@DataProvider(name="client1")
    public static Object[][] getClient1Data() {
        return new Object[][]{{1}};     
    }
     
    @DataProvider(name="client2")
    public static Object[][] getClient2Data() {
        return new Object[][]{{2}};     
    }
     
    @DataProvider(name="scenarioData")
    public static Object[][] getScenarioData(Method method) {       
        String testCase = method.getName();
        if ("scenario1".equals(testCase)) {
            return new Object[][]{{"Scenario1 data"}};
        } else if ("scenario2".equals(testCase)) {
            return new Object[][]{{"Scenario2 data"}};
        } else {
            return new Object[][]{{"Common scenario data"}};
        }
    }   
     
    @DataProvider(name="TestType")
    public static Object[][] getTestTypeData(ITestContext context) {        
        String testName = context.getName();
        if ("IntegrationLevel".equals(testName)) {
            return new Object[][]{{"Integration test data"}};
        } else if ("AcceptanceLevel".equals(testName)) {
            return new Object[][]{{"Acceptance test data"}};
        } else {
            return new Object[][]{{"Common test data"}};
        }
    } 

}
