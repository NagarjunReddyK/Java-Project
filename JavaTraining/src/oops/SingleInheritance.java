package oops;

public class SingleInheritance extends SingleParent{
	void m3(){
		System.out.println("Child class m3 method.");
	}
	void m4(){
		System.out.println("Child class m4 method.");
	}
	public static void main(String[] args) {
		SingleInheritance c=new SingleInheritance();
		SingleInheritance.m1();
		c.m2();
		c.m3();
		c.m4();
		
}
}

class SingleParent{
	static void m1(){
		System.out.println("Parent class m1 method...");
	}
	void m2(){
		System.out.println("Parent class m2 method...");
	}
}