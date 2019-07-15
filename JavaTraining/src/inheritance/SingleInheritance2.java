package inheritance;

public class SingleInheritance2 extends SingleParent {
	void m3(){
		System.out.println("Child class m3 method.");
	}
	void m4(){
		System.out.println("Child class m4 method.");
	}
	
	public static void main(String[] args) {
		SingleParent cc=new SingleInheritance2(); // it is not possible to call child class methods
		cc.m1();
		cc.m2();
		
		//SingleInheritance2 c= new SingleParent(); //Exception: Type mismatch: cannot convert from SingleParent to SingleInheritance
		
		SingleInheritance2 c= (SingleInheritance2) new SingleParent(); //Exception: oops.SingleParent cannot be cast to oops.SingleInheritance
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		
}

}
