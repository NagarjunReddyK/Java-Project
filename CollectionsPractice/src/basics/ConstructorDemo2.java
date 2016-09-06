package basics;

public class ConstructorDemo2 {
	ConstructorDemo2(int i){
		System.out.println("User-defined 1-arg constructor");
	}
	ConstructorDemo2(String username, String password){
		System.out.println("User-defined 2-arg constructor");
	}

	public static void main(String[] args) {
		//ConstructorDemo2 obj1 = new ConstructorDemo2();
		ConstructorDemo2 obj2 = new ConstructorDemo2(10);
		ConstructorDemo2 obj3 = new ConstructorDemo2("nagarjunreddyk","abcd@$123;");

	}

}
