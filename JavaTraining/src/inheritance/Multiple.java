package inheritance;


public class Multiple extends Parent01{//,Parent02{
	public static void main(String[] args) {
		Multiple obj=new Multiple();
		obj.login();
		
	}
}

class Parent01{
	void login(){
		System.out.println("Parent01 class login method..");
	}
}

class Parent02{
	void login(){
		System.out.println("Parent02 class login method..");
	}
}