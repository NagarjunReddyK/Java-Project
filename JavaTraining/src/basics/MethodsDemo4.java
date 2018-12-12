package basics;

// return type is mandatory for methods

public class MethodsDemo4 {
	void login(){   //login(){
		System.out.println("login instance method");
	}
	public static void main(String[] args){
		MethodsDemo4 obj = new MethodsDemo4();
		obj.login();
	}

}
