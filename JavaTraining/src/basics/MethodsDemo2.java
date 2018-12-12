package basics;

//Example-2:-instance & static methods with parameters.

public class MethodsDemo2 {
	void login1(int id,String name){ //instance method with parameters (local variables)
		System.out.println("login1 instance method");
		System.out.println(id+" --- "+name);
	}
	static void login2(String name,char gender){ //static method with parameters (local variables)
		System.out.println("login2 static method");
		System.out.println(name+" --- "+gender);
	}
	static void login3(boolean isValid,double avg){
		System.out.println("login3 static method");
		System.out.println(isValid+" --- "+avg);
	}
	public static void main(String[] args){
		MethodsDemo2 obj = new MethodsDemo2();
		obj.login1(111,"NagarjunReddyK"); //calling instance method by using object name
		MethodsDemo2.login2("Chaitanya",'M'); // calling static method by using class name
		MethodsDemo2.login3(true, 74.60);
	}

}
