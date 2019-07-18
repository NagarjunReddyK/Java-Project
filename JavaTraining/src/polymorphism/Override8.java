package polymorphism;

// Method hiding: both parent and child class methods should be static. Method resolution always takes care by compiler based on reference type.

public class Override8 {
	public static void main(String[] args) {
		Parent4 p=new Parent4();
		p.m1();
		
		Child4 c=new Child4();
		c.m1();
		
		Parent4 obj=new Child4();
		obj.m1();
		
	}

}


class Parent4{
	public static void m1(){
		System.out.println("Parent4 class");
	}
}

class Child4 extends Parent4{
	public static void m1(){
		System.out.println("Child4 class");
	}
	
}