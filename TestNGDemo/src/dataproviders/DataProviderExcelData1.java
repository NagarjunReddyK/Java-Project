package dataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelData1 {
	@Test(dataProvider="DP")
	public void verifyExcelData(String username,String password, String flag){
		System.out.println("Excel Data: "+username+", "+password+", "+flag);
	}
	
	
	@DataProvider(name="DP")
	public String[][] getExcelData() throws IOException
	{
		String data[][] = Utility.readXlsxFile(System.getProperty("user.dir")+"//src//dataproviders//TestData.xlsx");
		return data;
	}

}
