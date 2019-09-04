package testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Parent {
	@BeforeMethod
    public void beforeMethod() {
        System.out.println("Parent's Before method");
    }
 
    @AfterMethod
    public void afterMethod() {
        System.out.println("Parent's After method");
    }
 
    @BeforeClass
    public void beforeClass() {
        System.out.println("Parent's Before Class method");
    }
 
    @AfterClass
    public void afterClass() {
        System.out.println("Parent's After Class method");
    }

}
