package dataproviders;

import org.testng.annotations.Test;
//
public class DataProviderRegression {
	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
    public void regressionTest(String data) {
        System.out.println("Regression testing: " + data);
    }

}
