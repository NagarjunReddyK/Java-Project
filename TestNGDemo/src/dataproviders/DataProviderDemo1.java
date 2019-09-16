package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	@Test(dataProvider="getData")
    public void instanceDataProvider(String username, String password) {
        System.out.println(username + ", " +password);
    } 
	
	@DataProvider
    public Object[][] getData() {
		/*Object[][] obj=new Object[3][2];
		obj[0][0]="user1@xeno.com";
		obj[0][1]="Test@123";
		
		obj[1][0]="user2@xeno.com";
		obj[1][1]="xeno@111";
		
		obj[2][0]="user3@xeno.com";
		obj[2][1]="X+g@321";
		return obj;*/
		
		return new Object[][]{{"user1@xeno.com","Test@123"},{"user2@xeno.com","xeno@111"},{"user3@xeno.com","X+g@321"}};
    }

}
