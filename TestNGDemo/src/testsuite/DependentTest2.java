package testsuite;

import org.testng.annotations.Test;
//dependsOnMethods with multiple methods
public class DependentTest2 {
	@Test
	public void tc_Dependent_01(){
		System.out.println("tc_Dependent_01 method");
	}
	@Test
	public void tc_Dependent_02(){
		System.out.println("tc_Dependent_02 method");
	}
	@Test(dependsOnMethods={"tc_Dependent_01","tc_Dependent_02"})
	public void tc_Dependent_03(){
		System.out.println("tc_Dependent_03 method");
	}

}
