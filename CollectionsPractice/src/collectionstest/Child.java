package collectionstest;

public class Child extends Parent{
	void login(){
		System.out.println("Child login method");
	}
	public static void main(String[] args){
		Child c=new Child();
		c.login();
	}

}
