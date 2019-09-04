package testsuite;

import org.testng.annotations.Test;
// dependsOnMethods with single method
public class DependentTest1 {
	@Test
	public void tc_Dependent_01(){
		System.out.println("tc_Dependent_01 method");
	}
	@Test(dependsOnMethods={"tc_Dependent_01"})
	public void tc_Dependent_02(){
		System.out.println("tc_Dependent_02 method");
	}
	@Test
	public void tc_Dependent_03(){
		System.out.println("tc_Dependent_03 method");
	}

}
