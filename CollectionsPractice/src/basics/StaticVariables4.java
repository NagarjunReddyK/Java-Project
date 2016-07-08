package basics;

public class StaticVariables4 {
	int id=10; //instance variable
	static String name="Murali"; //static variable
	public static void main(String[] args){
		StaticVariables4 obj = new StaticVariables4();
		System.out.println(obj.id); //10
		System.out.println(StaticVariables4.name); //Murali
		obj.id=111;
		StaticVariables4.name="Nagarjun Reddy K";
		System.out.println(obj.id); //111
		System.out.println(StaticVariables4.name); //Nagarjun Reddy K
		
		StaticVariables4 obj2 = new StaticVariables4();
		System.out.println(obj2.id); //10
		System.out.println(StaticVariables4.name); //Nagarjun Reddy K
		
		StaticVariables4.name="Prasad";
		StaticVariables4 obj3 = new StaticVariables4();
		System.out.println(obj3.id); //10
		System.out.println(StaticVariables4.name); //Nagarjun Reddy K
		
	}
}
