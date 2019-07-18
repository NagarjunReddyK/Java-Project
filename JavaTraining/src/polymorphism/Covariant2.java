package polymorphism;

public class Covariant2 extends coparent{
	String m1(){
		System.out.println("child m1 method");
		return "str";
	}
	public static void main(String[] args) {
		coparent p=new coparent();
		p.m1();
		
		Covariant2 c=new Covariant2();
		c.m1();
		
		coparent p1=new Covariant2();
		p1.m1();
	}
}

class coparent{
	Object m1(){
		System.out.println("parent m1 method");
		return new Object();
	}
}
