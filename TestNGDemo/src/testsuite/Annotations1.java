package testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	@BeforeMethod
	public void before(){
		System.out.println("before method");
	}
	@AfterMethod
	public void after(){
		System.out.println("after method");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class method");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("after class method");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("before suite method");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("after suite method");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("before test method");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("after test method");
	}
	
	@Test
	public void tc_Login_01(){
		System.out.println("tc_Login_01 method");
	}
	@Test
	public void tc_Login_02(){
		System.out.println("tc_Login_02 method");
	}

}

/*

*/