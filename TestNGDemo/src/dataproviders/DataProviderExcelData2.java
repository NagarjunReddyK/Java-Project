package dataproviders;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelData2 {
	@Test(dataProvider="DP")
	public void tc_Login_01(String tcid,String username,String password,String vendorName, String billNumber){
		System.out.println("Excel Data: "+tcid+", "+username+", "+password+", "+vendorName+", "+billNumber);
	}
	
	@Test(dataProvider="DP")
	public void tc_Login_02(String tcid,String username,String password,String vendorName, String billNumber){
		System.out.println("Excel Data: "+tcid+", "+username+", "+password+", "+vendorName+", "+billNumber);
	}
	@Test(dataProvider="DP")
	public void tc_Login_03(String tcid,String username,String password,String vendorName, String billNumber){
		System.out.println("Excel Data: "+tcid+", "+username+", "+password+", "+vendorName+", "+billNumber);
	}
	
	
	@DataProvider(name="DP")
	public Object[][] getExcelData(Method method) throws IOException
	{
		Excel_Reader xl=new Excel_Reader(System.getProperty("user.dir")+"//src//dataproviders//TestData1.xlsx");
		return xl.getData("Sheet1", "TCID", method.getName());
	}

}
