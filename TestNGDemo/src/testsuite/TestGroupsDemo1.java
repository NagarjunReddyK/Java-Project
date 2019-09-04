package testsuite;

import org.testng.annotations.Test;

public class TestGroupsDemo1 {
	@Test(groups = {"sanity"})
    public void testMethodOne() {
        System.out.println("Test method one belonging to group.");
    }
 
    @Test(groups = {"regression"})
    public void testMethodTwo() {
        System.out.println("Test method two not belonging to group.");
    }
 
    @Test(groups = {"sanity"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to group.");
    }

}
