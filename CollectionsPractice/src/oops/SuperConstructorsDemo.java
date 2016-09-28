package oops;

public class SuperConstructorsDemo extends ParentDemo{
	
	SuperConstructorsDemo(String username, String password) {
		super(username,password);//calling parent class 2-arg constructor
	}
	SuperConstructorsDemo(){
		this(10); //calling current class 1-arg constructor
		System.out.println("Current class 0-arg constructor");
	}
	SuperConstructorsDemo(int count){
		super(30);//calling parent class 1-arg constructor
		System.out.println("Current class 1-arg constructor");
	}

	public static void main(String[] args) {
		new SuperConstructorsDemo();//call current class 0-arg constructor
	}

}
