package dataproviders;

import org.testng.annotations.Test;
//
public class DataProviderEndtoEnd {
	@Test(dataProvider="TestType", dataProviderClass=DataProviderSource.class)
    public void endToEndTest(String data) {
        System.out.println("End to End testing: " + data);
    }
	@Test
	public void endToEndTest2(){
		System.out.println("endToEndTest2 method");
	}

}
