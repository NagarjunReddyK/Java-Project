package oops;

public class AssociationDemo {
	public static void main(String[] args) {
		LoginTest login = new LoginTest();
		login.tcLogin1();
	}
}
class LoginTest{
	void tcLogin1(){
		System.out.println("This is first test case for Login");
	}
}