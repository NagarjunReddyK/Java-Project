package basics;

public class ConstructorDemo3 {
	String username,password;
	
	void display(){
		//printing instance variable values
		System.out.println("User Name is: "+username);
		System.out.println("Password is: "+password);
	}

	public static void main(String[] args) {
		ConstructorDemo3 obj = new ConstructorDemo3();
		obj.display();

	}
}
