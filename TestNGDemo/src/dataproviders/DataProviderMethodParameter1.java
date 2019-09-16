package dataproviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//
public class DataProviderMethodParameter1 {
	@Test(dataProvider="scenarioData")  //priority=1,
    public void scenario1(String scenarioData) {
        System.out.println("Scenario1 testing: " + scenarioData);
    }
     
    @Test(dataProvider="scenarioData")
    public void scenario2(String scenarioData) {
        System.out.println("Scenario2 testing: " + scenarioData);
    }

    @Test(dataProvider="scenarioData")
    public void commonScenarios(String scenarioData) {
        System.out.println("Common Scenarios testing: " + scenarioData);
    }
    
    @DataProvider(name="scenarioData")
    public Object[][] getScenarioData(Method method) {       
        String testCase = method.getName();
        System.out.println(testCase);
        if ("scenario1".equals(testCase)) {
            return new Object[][]{{"Scenario1 data"},{"SC01 data"}};
        } else if ("scenario2".equals(testCase)) {
            return new Object[][]{{"Scenario2 data"}};
        } else {
            return new Object[][]{{"Common scenario data"}};
        }
    } 
}
