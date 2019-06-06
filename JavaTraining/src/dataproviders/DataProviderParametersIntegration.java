package dataproviders;

import org.testng.annotations.Test;

public class DataProviderParametersIntegration {
	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
    public void integrationTest(String data) {
        System.out.println("Integration testing: " + data);
    }

}
