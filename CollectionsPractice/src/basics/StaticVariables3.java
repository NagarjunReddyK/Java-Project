package basics;

public class StaticVariables3 {
	// instance variables
	int id=111;
	String name="Nagarjun Reddy K";
	
	// static variables
	static int age=30;
	static String designation="Senior Test Engineer";

	//instance method
	void details(){
		System.out.println(id+", "+name);
		System.out.println(StaticVariables3.age+", "+StaticVariables3.designation);
	}
	//static method
	static void display(){
		StaticVariables3 obj = new StaticVariables3();
		System.out.println(obj.id+", "+obj.name);
		System.out.println(StaticVariables3.age+", "+StaticVariables3.designation);
	}
	public static void main(String[] args){
		StaticVariables3 obj = new StaticVariables3();
		obj.details(); // calling instance method
		//display(); // calling static method directly
		StaticVariables3.display(); // calling static method with classname.methodname
		//obj.display(); // calling static method by using object
		
	}

}
