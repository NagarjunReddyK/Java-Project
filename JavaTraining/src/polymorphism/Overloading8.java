package polymorphism;

//In overloading, method resolution always takes care by compiler based on reference type. runtime object never plays any role.
public class Overloading8 {
	void m1(Login1 a){
		System.out.println("Login version");
	}
	void m1(Home m){
		System.out.println("Home version");
	}
	public static void main(String[] args) {
		Overloading8 obj=new Overloading8();
		
		Login1 a=new Login1();
		obj.m1(a);
		
		Home m=new Home();
		obj.m1(m);
		
		Login1 aa=new Home();
		obj.m1(aa);
	}
}

class Login1{
	
}
class Home extends Login1{
	
}