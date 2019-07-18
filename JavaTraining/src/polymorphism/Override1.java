package polymorphism;

//Overridden method signature & overriding method signatures must be same.
//The return types of overridden method & overriding method must be same at primitive level.
// Both parent and child class methods should be non-static (instance)

public class Override1 extends Overridden1{
	 //overriding method
	void config(){  
		System.out.println("config method of Override1 class");
	}
	public static void main(String[] args) {
		Override1 obj=new Override1();
		obj.config();
		
		Overridden1 obj2=new Overridden1();
		obj2.config();
	}
}

class Overridden1{
	//overridden method
	void config(){  
		System.out.println("config method of Overridden1 class");
	}
}