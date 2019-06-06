package dataproviders;

import org.testng.annotations.Test;

public class DataProviderParametersAcceptance {
	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
    public void acceptanceTest(String data) {
        System.out.println("Acceptance testing: " + data);
    }

}
