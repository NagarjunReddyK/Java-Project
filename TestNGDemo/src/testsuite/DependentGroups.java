package testsuite;

import org.testng.annotations.Test;
//dependsOnGroups
public class DependentGroups {
	@Test(groups = {"sanity"})
    public void tc_Groups_01() {
        System.out.println("tc_Groups_01 belonging to sanity group.");
    }
 
    @Test(groups = {"sanity"})
    public void tc_Groups_02() {
        System.out.println("tc_Groups_02 belonging to sanity group.");
    }
 
    @Test(groups = {"regression"})
    public void tc_Groups_03() {
        System.out.println("tc_Groups_03 belonging to regression group.");
    }
    @Test(groups = {"regression"})
    public void tc_Groups_04() {
        System.out.println("tc_Groups_04 belonging to regression group.");
    }
    
    @Test(dependsOnGroups = {"sanity"})
    public void tc_Groups_05() {
        System.out.println("tc_Groups_05 method executes if all test cases belonging to sanity group are passed.");
    }

}
