package polymorphism;

//In overriding, method resolution always takes care by jvm based on runtime object, but not reference type.
public class Override2 extends Overridden2{
	//overriding method
		void config(){  
			System.out.println("config method of Override1 class (Child class)");
		}
		public static void main(String[] args) {
			Override2 obj1=new Override2();
			obj1.config();
			
			Overridden2 obj2=new Overridden2();
			obj2.config();
			
			Overridden2 obj3=new Override2();
			obj3.config();
			
			/*Override2 obj4=new Overridden2();  // Compile-time Exception: Type mismatch: cannot convert from Overridden2 to Override2
			obj4.config();*/
			
			
		}

}


class Overridden2{
	//overridden method
	void config(){  
		System.out.println("config method of Overridden2 class (Parent class)");
	}
}