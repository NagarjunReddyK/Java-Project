package inheritance;

public class Child extends Parent {
	void m2(){
		System.out.println("Child m2 method");
	}
	
	public static void main(String[] args) {
		/*Parent p=new Parent();
		p.m1();
	//	p.m2(); //The method m2() is undefined for the type Parent
*/
		/*Child c=new Child();
		c.m1();
		c.m2();*/
		
		/*Parent p=new Child();
		p.m1();
		p.m2(); //The method m2() is undefined for the type Parent
*/
	
	//	Child c=new Parent(); //Type mismatch: cannot convert from Parent to Child
	
	}

}
