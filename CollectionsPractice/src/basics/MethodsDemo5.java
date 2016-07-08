package basics;

public class MethodsDemo5 {
	void login1(){
		System.out.println("login1 instance method");
	}
	void login1(int id){
		System.out.println("login1 instance method test --- "+id);
	}
	public static void main(String[] args){
		MethodsDemo5 obj = new MethodsDemo5();
		obj.login1();
		obj.login1(111);
	}
}
