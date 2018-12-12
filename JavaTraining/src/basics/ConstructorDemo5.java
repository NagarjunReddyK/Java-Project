package basics;

public class ConstructorDemo5 {
	//instance variables
	String username,password;
	
	void display(){
		//printing instance variable values
		System.out.println("User Name is: "+username);
		System.out.println("Password is: "+password);
	}
	
	ConstructorDemo5(String username, String password){
		//assigning local values to instance variables
		this.username=username;
		this.password=password;
	}
	
	public static void main(String[] args) {
		ConstructorDemo5 obj = new ConstructorDemo5("nkasu@gmail.com","asdf@123");
		obj.display();
		ConstructorDemo5 obj2 = new ConstructorDemo5("testuser@gmail.com","test1234");
		obj2.display();
	}

}
