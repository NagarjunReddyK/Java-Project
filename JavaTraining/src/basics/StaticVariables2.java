package basics;
//
public class StaticVariables2 {
	// static variables
	static String name="NagarjunReddy"; 
	static int age=30;
	// static method
	static void display(){
		System.out.println("Name is: "+StaticVariables2.name+", Age is: "+StaticVariables2.age);
	}
	//instance method
	void show(){
		System.out.println("Name is: "+StaticVariables2.name+", Age is: "+StaticVariables2.age);
	}
	// main method
	public static void main(String[] args){
		StaticVariables2 ref=new StaticVariables2();
		StaticVariables2.display(); // calling static method in static area
		ref.show(); // calling instance method in static area
	}
}
