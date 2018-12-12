package basics;

//By using constructors copy the values of one object to another object.
public class ConstructorDemo7 {
	//instance variables
		String username,password;
		ConstructorDemo7(String username, String password){
			//assigning local values to instance variables
			this.username=username;
			this.password=password;
		}
		ConstructorDemo7(ConstructorDemo7 con){
			this.username=con.username;
			this.password=con.password;
			//display();
		}
		
		void display(){
			//printing instance variable values
			System.out.println("User Name is: "+username);
			System.out.println("Password is: "+password);
		}

	public static void main(String[] args) {
		ConstructorDemo7 obj1 = new ConstructorDemo7("testuser@gmail.com","abcd1234");
		ConstructorDemo7 obj2 = new ConstructorDemo7(obj1);
		obj1.display();
		obj2.display();

	}

}
