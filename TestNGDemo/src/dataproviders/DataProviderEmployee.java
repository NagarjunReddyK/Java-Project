package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//
public class DataProviderEmployee {
	@Test(dataProvider="credentials")
    public void empTest(Employee e) {
        System.out.println(e.user);
        System.out.println(e.password);
    }   
     
     
    @DataProvider(name="credentials") 
    public Object[][] getEmployeeData() {
        return new Object[][]{{new Employee("nkasu@xeno.com","Xeno@123")}, {new Employee("nag@gmail.com","Test@321")}};
    }

}
