package polymorphism;

public class SuperConstructors extends ConstructorsParent{
	SuperConstructors(){
		this(10); //current class 1-arg constructor calling
		System.out.println("Child class 0-arg constructor");
	}
	SuperConstructors(int a){
		super(); // super class 0-arg constructor calling
		System.out.println("Child class 1-arg constructor");
	}
	public static void main(String[] args) {
		SuperConstructors obj=new SuperConstructors();   //new SuperConstructors();
	}
}

class ConstructorsParent{
	ConstructorsParent(){
		System.out.println("Parent 0-arg constructor");
	}
}


//Parent 0-arg constructor
//Child class 1-arg constructor
//Child class 0-arg constructor