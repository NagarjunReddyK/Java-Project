package dataproviders;

import org.testng.annotations.Test;

public class DataProviderParametersExample {
	@Test(dataProvider="scenarioData", dataProviderClass=DataProviderSource.class)
    public void scenario1(String scenarioData) {
        System.out.println("Scenario testing: " + scenarioData);
    }
     
    @Test(dataProvider="scenarioData", dataProviderClass=DataProviderSource.class)
    public void scenario2(String scenarioData) {
        System.out.println("Scenario testing: " + scenarioData);
    }
     
    @Test(dataProvider="scenarioData", dataProviderClass=DataProviderSource.class)
    public void commonScenarios(String scenarioData) {
        System.out.println("Common Scenarios testing: " + scenarioData);
    }

}
