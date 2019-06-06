package dataproviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParametersEmployee {
	@Test(dataProvider="employeeData")
    public void empTest(Employee employee) {
        System.out.println("Employee Data: " + employee);
    }   
     
     
    @DataProvider(name="employeeData") 
    public Object[][] getEmployeeData() {
        return new Object[][]{{new Employee("Nagarjun Reddy K",32)}, {new Employee("Chaitanya K",29)}};
    }

}
