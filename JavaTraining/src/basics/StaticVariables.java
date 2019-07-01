package basics;

public class StaticVariables {
	//static variables
	static String name="test name";
	static int age=30;
	//static method
	public static void main(String[] args){
		System.out.println("Name is: "+name+", Age is: "+age); // direct access
		System.out.println("Name is: "+StaticVariables.name+", Age is: "+StaticVariables.age); // access by using class name
		StaticVariables obj=new StaticVariables();
		System.out.println("Name is: "+obj.name+", Age is: "+obj.age); // access by using reference variable
	}
}
