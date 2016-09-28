package oops;

public class SuperMethodsDemo extends ParentDemo{
	SuperMethodsDemo(String username, String password) {
		super(username,password);
	}
	void login1(){
		System.out.println("Child class login1 method");
	}
	void login2(){
		this.login1();
		super.login1(); //calling parent class login1()
		super.parentMethod1();//calling parent class parentMethod1()
	}
	public static void main(String[] args) {
		new SuperMethodsDemo("nagarjun@gmail.com","Test@$123;").login2();
	}

}
