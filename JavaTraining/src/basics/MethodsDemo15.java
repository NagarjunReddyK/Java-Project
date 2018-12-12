package basics;

public class MethodsDemo15 {
	String username="testuser";
	
	String login(String username){
		return this.username; // returns instance variable value
	}

	public static void main(String[] args) {
		MethodsDemo15 obj = new MethodsDemo15();
		String user=obj.login("owner");
		System.out.println("login method return value is: "+user); //printing return value
	}

}
