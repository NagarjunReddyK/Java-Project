package polymorphism;

//A method declared as static cannot be overridden 
public class Override7 extends Overridden7{
	/*public void m1(){ //Exception: This instance method cannot override the static method from Overridden6
		System.out.println("child m1");
	}*/
	
	public static void main(String[] args) {
		System.out.println("A method declared as static cannot be overridden ");
	}

}


class Overridden7{
	public static void m1(){
		System.out.println("parent m1");
	}
}
