package polymorphism;

// Overriding concept is not applicable for variables.
//Variable hiding or Shadowing: method resolution always takes care by compiler based on reference type.
public class Override10 {
	public static void main(String[] args) {
		Parent10 p=new Parent10();
		System.out.println(p.str);
		
		Child10 c=new Child10();
		System.out.println(c.str);
		
		Parent10 pp=new Child10();
		System.out.println(pp.str);
	}

}

class Parent10{
	String str="Parent";
}

class Child10 extends Parent10{
	String str="Child";
}

/*
P-->instance	P-->static		P-->instance	P-->static
C-->instance	C-->instance	C-->static		C-->static
------------------------------------------------------------
Parent			Parent			Parent			Parent
Child			Child			Child			Child
Parent			Parent			Parent			Parent		

*/