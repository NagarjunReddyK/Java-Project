package oops;

public class SuperConstructors2 extends ConstructorsParent2{
	SuperConstructors2(){
		this(10);
		System.out.println("Chicd class 0-arg constructor");
	}
	SuperConstructors2(int a){
		//super(); compiler generates this super 
		System.out.println("Chicd class 1-arg constructor");
	}
	public static void main(String[] args) {
		new SuperConstructors2();
	}

}

class ConstructorsParent2{
	ConstructorsParent2(){
		System.out.println("Parent 0-arg constructor");
	}
}