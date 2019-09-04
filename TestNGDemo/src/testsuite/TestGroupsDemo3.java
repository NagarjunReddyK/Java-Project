package testsuite;

import org.testng.annotations.Test;

public class TestGroupsDemo3 {
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
    @Test(groups = {"endtoend"})
    public void tc_Groups_05() {
        System.out.println("tc_Groups_05 belonging to endtoend group.");
    }
    @Test(groups = {"endtoend"})
    public void tc_Groups_06() {
        System.out.println("tc_Groups_06 belonging to endtoend group.");
    }
    @Test(groups = {"volumetest"})
    public void tc_Groups_07() {
        System.out.println("tc_Groups_07 belonging to volumetest group.");
    }

}
