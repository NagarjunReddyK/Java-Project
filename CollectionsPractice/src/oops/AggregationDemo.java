package oops;

public class AggregationDemo {
	//instance variables
	String privilege;
	SignIn login;
	//constructor with 2-arguments
	AggregationDemo(String privilege, SignIn login){
		this.privilege=privilege;
		this.login=login;
	}
	//instance method
	void display(){
		System.out.println("---User Details---");
		System.out.println("User Privilege: "+privilege);
		System.out.println("Credentials: "+login.username+" "+login.password);
	}
	public static void main(String[] args){
		SignIn log=new SignIn("nagarjunreddy@gmail.com","Test@123");
		AggregationDemo agg1 = new AggregationDemo("Admin",log);
		agg1.display();
		// or use nameless object
		new AggregationDemo("Approver",new SignIn("nagarjun.test@gmail.com","Abcd@1234")).display();
	}
}

class SignIn{
	String username,password;
	SignIn(String username, String password){
		this.username=username;
		this.password=password;
	}
}
