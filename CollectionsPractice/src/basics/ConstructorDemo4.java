package basics;

public class ConstructorDemo4 {
	String username,password;
	
	void display(){
		//printing instance variable values
		System.out.println("User Name is: "+username);
		System.out.println("Password is: "+password);
	}
	
	ConstructorDemo4(){
		username="nag@gmail.com";
		password="test@123";
	}
	
	public static void main(String[] args) {
		ConstructorDemo4 obj = new ConstructorDemo4();
		obj.display();

	}

}
