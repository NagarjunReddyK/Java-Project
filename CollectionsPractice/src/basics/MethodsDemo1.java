package basics;

//Ex-1: instance & static methods without arguments.

public class MethodsDemo1 {
	void login1(){ //instance method
		System.out.println("login1 instance method");
	}
	static void login2(){ //static method
		System.out.println("login2 static method");
	}
	public static void main(String[] args){
		MethodsDemo1 obj = new MethodsDemo1();
		obj.login1(); //calling instance method by using object name
		MethodsDemo1.login2(); // calling static method by using class name
	}

}
