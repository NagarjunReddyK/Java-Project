package testsuite;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
@Test(groups={"default"})
public class TestGroupsDemo2 {
	@BeforeGroups("sanity")
	public void beforeGroup(){
		System.out.println("Before Group method");
	}
	
	@Test(groups = {"sanity"})
    public void testMethodOne() {
        System.out.println("Test method one belonging to sanity group.");
    }
 
    @Test(groups = {"sanity","regression"})
    public void testMethodTwo() {
        System.out.println("Test method two belonging to both sanity & regression groups.");
    }
 
    @Test(groups = {"sanity"})
    public void testMethodThree() {
        System.out.println("Test method three belonging to sanity group.");
    }

}
