package oops;

public class SuperVariablesDemo extends ParentDemo{
	String username,password;
	SuperVariablesDemo(String username, String password){
		super("parent@gmail.com","pwd@parent1");
		//super(10);
		this.username=username;
		this.password=password;
	}
	void login(String username, String password){
		System.out.println(username+"---"+password);//local variables
		System.out.println(this.username+"---"+this.password);//calling current class instance variables
		System.out.println(super.username+"---"+super.password);//calling parent class variables
	}
	public static void main(String[] args) {
		new SuperVariablesDemo("nag@gmail.com","Test@111").login("local@gmail.com", "Test@local");
	}

}
