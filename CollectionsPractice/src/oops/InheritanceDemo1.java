package oops;

public class InheritanceDemo1 extends ParentDemo{
	InheritanceDemo1(){
		super("user","password");
	}
	void childMethod1(){
		System.out.println("This is childMethod1");
	}
	void childMethod2(){
		System.out.println("This is childMethod2");
	}
	public static void main(String[] args) {
		InheritanceDemo1 obj = new InheritanceDemo1();
		obj.parentMethod1();
		InheritanceDemo1.parentMethod2();
		obj.childMethod1();
		obj.childMethod2();
	}
}
