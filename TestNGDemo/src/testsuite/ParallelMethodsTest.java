package testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelMethodsTest {
	@BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-method. Thread id is: " + id);
    }
 
    @Test
    public void tc_Parallel_01() {
        long id = Thread.currentThread().getId();
        System.out.println("tc_Parallel_01 method --> Thread id is: " + id);
    }
 
    @Test
    public void tc_Parallel_02() {
        long id = Thread.currentThread().getId();
        System.out.println("tc_Parallel_02 method --> Thread id is: " + id);
    }
 
    @AfterMethod
    public void afterMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-method. Thread id is: " + id);
    }

}
