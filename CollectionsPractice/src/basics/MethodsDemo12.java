package basics;

public class MethodsDemo12 {
	String username,password;
	void credentials(String username, String password){
		System.out.println(username+" --- "+password); //local variables
		//conversion of local to instance (passing local variables values to instance variables)
		this.username=username;
		this.password=password;
	}
	void login(){
		System.out.println("Values of instance variables: "+username+", "+password);
	}
	public static void main(String[] args){
		MethodsDemo12 obj = new MethodsDemo12();
		obj.credentials("nag@gmail.com", "Test@123");
		obj.login();
	}

}
