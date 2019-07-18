package polymorphism;

public class SuperMethods extends MethodsParent{
	void m1(){
		System.out.println("Child class m1 method");
	}
	void m2(){
		m1(); //current class m1 method as it gives first priority to local members
		super.m1();
		
	}
	public static void main(String[] args) {
		SuperMethods obj=new SuperMethods();
		obj.m2();
	}

}

class MethodsParent{
	void m1(){
		System.out.println("Parent class m1 method");
	}
}