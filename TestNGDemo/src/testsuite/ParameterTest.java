package testsuite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	// Value of the parameter is defined at suite level
	@Parameters({ "suite-param" })
	@Test
	public void prameterTestOne(String param) {
		System.out.println("Test one suite param is: " + param);
	}

	// Value of the parameter is defined at test level.
	@Parameters({ "test-param" })
	@Test
	public void prameterTestTwo(String param) {
		System.out.println("Test two param is: " + param);
	}

	// Value of the test parameter is defined at test level. The suite level parameter is overridden at the test level.
	@Parameters({ "suite-param", "test-three-param" })
	@Test
	public void prameterTestThree(String param, String paramTwo) {
		System.out.println("Test three suite param is: " + param);
		System.out.println("Test three param is: " + paramTwo);
	}

}
