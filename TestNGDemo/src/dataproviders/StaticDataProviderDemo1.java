package dataproviders;

import org.testng.annotations.Test;

public class StaticDataProviderDemo1 {
	@Test(dataProvider="client1", dataProviderClass=DataProviderSource.class)
	public void client1Test(String browser) {
		System.out.println(browser);
	}   

	@Test(dataProvider="client2", dataProviderClass=DataProviderSource.class)
	public void client2Test(String browser) {
		System.out.println(browser);
	}
}
