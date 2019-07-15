package inheritance;

public class MultilevelInheritance extends Parent2{
	void m5(){
		System.out.println("This is m5 method of Child class ");
	}
	public static void main(String[] args) {
		MultilevelInheritance c=new MultilevelInheritance();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m5();
	}

}

class Parent1{
	void m1(){
		System.out.println("This is m1 method of Parent1 class ");
	}
	void m2(){
		System.out.println("This is m2 method of Parent1 class ");
	}
}

class Parent2 extends Parent1{
	void m3(){
		System.out.println("This is m3 method of Parent2 class ");
	}
	void m4(){
		System.out.println("This is m4 method of Parent2 class ");
	}
}