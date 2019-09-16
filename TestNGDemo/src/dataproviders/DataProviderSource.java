package dataproviders;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
//

public class DataProviderSource {
	@DataProvider(name="client1")
    public static Object[][] getClient1Data() {
        return new Object[][]{{"Chrome"}};     
    }
     
    @DataProvider(name="client2")
    public static Object[][] getClient2Data() {
        return new Object[][]{{"ie"}};     
    }
    
    @DataProvider
    public static Object[][] getData() {
        return new Object[][]{{"nkasu@xtglobal.com","xeno@123$","invpwd"}, {"fisr29@xeno.com","Test@123","invuser"},
        	{"fisbilling","Abc@1234","invEmail"},{"","","blank"}};
    }
       
     
    @DataProvider(name="TestType")
    public static Object[][] getTestTypeData(ITestContext context) {        
        String testName = context.getName();
        if ("RegressionTest".equals(testName)) {
            return new Object[][]{{"Regression test data"}};
        } else if ("EndtoEndTest".equals(testName)) {
            return new Object[][]{{"End to End test data"}};
        } else {
            return new Object[][]{{"Sanity test data"}};
        }
    }
    
    @DataProvider(name="TestData")
    public static Object[][] getTestData(ITestContext context) {        
        String testName = context.getName();
        if ("RegressionTest".equals(testName)) {
            return new Object[][]{{"Nagarjun Reddy","K","nkasu@xtglobal.com"},{"Srinivas","P","srinivas@fitl.com"}};
        } else if ("SanityTest".equals(testName)) {
        	return new Object[][]{{"nkasu@xtglobal.com","Test@123","invpwd"},{"fisr29@xeno.com","xeno@123","invuser"}};
            
        } else {
        	return new Object[][]{{"End to End test data"}};
        }
    }
    
    @DataProvider(name="groupData")
    public static Object[][] getGroupData(ITestContext context){
    	for(String group:context.getIncludedGroups()){
    		if(group.equalsIgnoreCase("login")){
    			return new Object[][]{{"nag@gmail.com","Abc@123!"},{"fisbilling@xeno.com","xeno@123"}};
    			
    		}
    		else if(group.equalsIgnoreCase("signup")){
    			return new Object[][]{{"Nagarjun Reddy"}};
    		}
    	}
		return null;
    }
    
    

}
