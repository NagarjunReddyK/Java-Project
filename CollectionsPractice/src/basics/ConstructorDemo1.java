package basics;

public class ConstructorDemo1 {

	ConstructorDemo1(){
		System.out.println("User-defined 0-arg constructor");
	}
	ConstructorDemo1(int i){
		System.out.println("User-defined 1-arg constructor");
	}
	ConstructorDemo1(String username, String password){
		System.out.println("User-defined 2-arg constructor");
	}

	public static void main(String[] args) {
		ConstructorDemo1 obj1 = new ConstructorDemo1();
		ConstructorDemo1 obj2 = new ConstructorDemo1(10);
		ConstructorDemo1 obj3 = new ConstructorDemo1("nagarjunreddyk","abcd@$123;");

	}

}
