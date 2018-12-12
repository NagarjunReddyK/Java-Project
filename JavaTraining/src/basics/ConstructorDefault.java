package basics;

public class ConstructorDefault {
	void login1(){
		System.out.println("login1 method...");
	}
	ConstructorDefault(){
		System.out.println("ffgh");
	}
	
	public static void main(String[] args){
		ConstructorDefault obj = new ConstructorDefault();
		obj.login1();
		//new ConstructorDefault().login1();
	}
}
