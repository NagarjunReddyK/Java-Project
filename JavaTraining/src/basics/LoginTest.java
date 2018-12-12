package basics;

public class LoginTest {
	DashboardTest tc_Login1(){
		System.out.println("tc_Login1 testcase...");
		return new DashboardTest();
	}
	public static void main(String[] args){
		LoginTest test=new LoginTest();
		DashboardTest dash=test.tc_Login1();
		dash.tc_Dashboard1();
	}
}
