package inheritance;

public class SingleInheritance extends SingleParent{
	void m3(){
		System.out.println("Child class m3 method.");
	}
	void m4(){
		System.out.println("Child class m4 method.");
	}

	public static void main(String[] args) {
		//Object creation for Child class
		SingleInheritance c=new SingleInheritance();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
			

		//object creation for Parent class
		SingleParent p=new SingleParent();
		p.m1();
		p.m2();

	}
}