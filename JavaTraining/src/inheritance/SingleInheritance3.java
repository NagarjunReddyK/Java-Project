package inheritance;

public class SingleInheritance3 extends SingleParent{
	//Overriding m1() & m2() methods of SingleParent class
	void m1(){
		System.out.println("Child class m1 method...");
	}
	void m2(){
		System.out.println("Child class m2 method...");
	}
	public static void main(String[] args) {
		// To call overriding methods in child class
		SingleInheritance3 obj=new SingleInheritance3();
		obj.m1();
		obj.m2();
		
		// To call overridden methods from Parent class
		/*SingleParent ob=new SingleParent();
		ob.m1();
		ob.m2();*/
		
	}

}
