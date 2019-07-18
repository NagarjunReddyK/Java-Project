package polymorphism;

// Co-variant return types :
/*it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive, 
but it changes its return type to subclass type.*/

public class Override15 extends Overridden15{
	Dashboard m1(){
		System.out.println("m1 method in Override15 class");
		return new Dashboard();
	}
	public static void main(String[] args) {
		Overridden15 o=new Overridden15();
		Login l=o.m1();
		l.m1();
		
		Override15 obj=new Override15();
		Dashboard d=obj.m1();
		d.m1();
		
		Overridden15 ob=new Override15();
		ob.m1();
	}
}

class Overridden15{
	Login m1(){
		System.out.println("m1 method in Overridden15 class");
		return new Login();
	}
}

class Login{
	void m1(){
		System.out.println("m1 method in Login class");
	}
}

class Dashboard extends Login{
	void m1(){
		System.out.println("m1 method in Dashboard class");
	}
}
