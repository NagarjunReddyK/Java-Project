package basics;

public class InstanceVariables {
	String name="TestName";
	int age=30;
	void display(){
		System.out.println("Name is: "+name+", Age is: "+age);
	}
	static void show(){
		InstanceVariables obj= new InstanceVariables();
		System.out.println("Name is: "+obj.name+", Age is: "+obj.age);
	}
	public static void main(String[] args){
		InstanceVariables instance= new InstanceVariables();
		instance.display();
		instance.show();
		InstanceVariables.show();
		show();
	}

}
