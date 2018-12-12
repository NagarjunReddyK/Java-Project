package basics;

public class MethodsDemo14 {
	String role="Admin";
	String login(String role){
		System.out.println("login method with local variable...");
		return role;
	}
	String login(){
		System.out.println("login method without local variable...");
		return role;
	}
	public static void main(String[] args){
		MethodsDemo14 obj = new MethodsDemo14();
		String local=obj.login("Analyst");
		System.out.println("Role is: "+local);
		String instance=obj.login();
		System.out.println("Role is: "+instance);
	}

}
