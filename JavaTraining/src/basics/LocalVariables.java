package basics;

public class LocalVariables {
	void displayAge(){
		//local variable
		int a=20;
		System.out.println(a);
	}
	public static void main(String[] args){
		//local variables
		String name="testname";
		int age=30;
		System.out.println("Name is: "+name+", Age is: "+age);
		LocalVariables var=new LocalVariables();
		var.displayAge();
	}
}
