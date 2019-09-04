package testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Child extends Parent{
	@BeforeMethod
    public void beforeChildMethod() {
        System.out.println("ChildClass's Before method");
    }
	 
    @AfterMethod
    public void afterChildMethod() {
        System.out.println("ChildClass's After method");
    }
 
    @BeforeClass
    public void beforeChildClass() {
        System.out.println("ChildClass's Before Class method");
    }
 
    @AfterClass
    public void afterChildClass() {
        System.out.println("ChildClass's After Class method");
    }
     
    @Test
    public void testCase() {
        System.out.println("===== Executing actual test case ======");
    }

}

/*Parent's Before Class method
ChildClass's Before Class method
Parent's Before method
ChildClass's Before method
===== Executing actual test case ======
ChildClass's After method
Parent's After method
ChildClass's After Class method
Parent's After Class method*/