package oops;

public class SuperVariables extends SuperParent{
	String userName="Instance User";
	String password="Instance pwd";
	
	void login(String userName,String password){
		System.out.println(userName+"---"+password);
		System.out.println(this.userName+"---"+this.password);
		System.out.println(super.userName+"---"+super.password);
		
	}
	public static void main(String[] args) {
		SuperVariables obj=new SuperVariables();
		obj.login("local user","local pwd");
	}

}

class SuperParent{
	String userName="Parent User";
	String password="Parent pwd";
}
