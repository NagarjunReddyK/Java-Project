package oops;

public class InstanceofDemo {
	public static void main(String[] args) {
		InstanceofDemo instance = new InstanceofDemo();
		Base base = new Base();
		Login login = new Login();
		Object obj = new Object();
		System.out.println(login instanceof Base);//true
		System.out.println(base instanceof Login);//false
		System.out.println(base instanceof Object);//true
		System.out.println(obj instanceof Base);//false
		System.out.println(instance instanceof Object);//true
		System.out.println(obj instanceof InstanceofDemo);//false
		//System.out.println(instance instanceof Login); //compilation error
		//System.out.println(instance instanceof Base);// compilation error
	}
}
class Base{
	
}
class Login extends Base{
	
}
