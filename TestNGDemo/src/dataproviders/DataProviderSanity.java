package dataproviders;

import org.testng.annotations.Test;

public class DataProviderSanity {
	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
    public void sanityTest(String data) {
        System.out.println("Sanity testing: " + data);
    }

}
