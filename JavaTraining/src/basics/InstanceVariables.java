package basics;

public class InstanceVariables {
	//instance variables
	String name="TestName";
	int age=30;
	//instance method
	void display(){
		System.out.println("Name is: "+name+", Age is: "+age);
	}
	//static method
	static void show(){
		InstanceVariables obj= new InstanceVariables();
		System.out.println("Name is: "+obj.name+", Age is: "+obj.age);
	}
	public static void main(String[] args){
		InstanceVariables instance= new InstanceVariables();
		instance.display(); //accessing instance method in static area
		//instance.show();
		InstanceVariables.show(); // accessing static method
		//show();
	}

}
