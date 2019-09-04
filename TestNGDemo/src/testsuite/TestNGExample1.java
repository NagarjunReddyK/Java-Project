package testsuite;

import org.testng.annotations.Test;
//prioriry, enabled, invocationCount, dependsOnMethods
public class TestNGExample1 {
	
	@Test(priority=0,timeOut=500)
	public void login() throws InterruptedException{
		System.out.println("login method");
		//System.out.println(10/0);
	}
	@Test(priority=1)
	public void dashboard(){
		System.out.println("dashboard method");
	}
	@Test(priority=2,dependsOnMethods="login")
	public void search(){
		System.out.println("search method");
	}

}
