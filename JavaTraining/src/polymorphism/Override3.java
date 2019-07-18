package polymorphism;

//What is the output of this program?

public class Override3 extends A{
	void login(){
		System.out.println("login method from class Override3");
	}
	public static void main(String[] args) {
		A a1=new A();
		a1.login();
		
		A a2=new B();
		a2.login();
		
		A a3=new Override3();
		a3.login();
	}

}



class A{
	void login(){
		System.out.println("login method from class A");
	}
}

class B extends A{
	void login(){
		System.out.println("login method from class B");
	}
}