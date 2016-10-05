package basics;

public class ConstructorDemo6 {
	ConstructorDemo6(){
		this(111);
		System.out.println("0-arg constructor");
	}
	ConstructorDemo6(int a){
		this("nagarjunreddyk","test@111");
		System.out.println("1-arg constructor: "+a);
	}
	ConstructorDemo6(String username, String password){
		System.out.println("2-arg constructor: "+username+" --- "+password);
	}

	public static void main(String[] args) {
		new ConstructorDemo6();

	}

}
