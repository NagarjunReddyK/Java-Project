package dataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class DataProviderExcelData {
	@Test(dataProvider="DP")
	public void verifyExcelData(String username1,String password1){
		System.out.println("Excel Data: "+username1+" ,"+password1);
	}
	
	
	
	@DataProvider(name="DP")
	public String[][] feedDP() throws BiffException, IOException
	{
		String data[][] = Utility.readXlsFile(System.getProperty("user.dir")+"//src//dataproviders//InputData.xls");
		return data;
	}

}
