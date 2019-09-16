package testsuite;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Listeners(Listener.class)
public class ListenerDemo {
	@BeforeTest
	public void beforeTest(){
		System.out.println("before Test method)");
	}
	@Test
	public void tc_Login_01(){
		System.out.println("tc_Login_01()");
	}
	@Test
	public void tc_Login_02(){
		System.out.println("tc_Login_02()");
	}
	@Test
	public void tc_Login_03(){
		System.out.println("tc_Login_03()");
	}

}
