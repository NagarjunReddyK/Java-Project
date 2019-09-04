package testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelSuiteTest {
	String testName = "";
	 
    @BeforeTest
    @Parameters({"browser"})
    public void beforeTest(String testName) {
        this.testName = testName;
        long id = Thread.currentThread().getId();
        System.out.println("Before test: " + testName + ". Thread id is: " + id);
    }
 
    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before class:" + testName + ". Thread id is: "+ id);
    }
 
    @Test
    public void tc_Parallel_01() {
        long id = Thread.currentThread().getId();
        System.out.println("tc_Parallel_01 method: " + testName+ ". Thread id is: " + id);
    }
 
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After class: " + testName+ ". Thread id is: " + id);
    }
 
    @AfterTest
    public void afterTest() {
        long id = Thread.currentThread().getId();
        System.out.println("After test: " + testName + ". Thread id is: " + id);
    }

}
