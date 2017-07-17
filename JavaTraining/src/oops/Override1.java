package oops;

public class Override1 extends Overridden1{
	void config(){
		System.out.println("config method of Override1 class");
	}
	public static void main(String[] args) {
		Override1 obj=new Override1();
		obj.config();
	}
}

class Overridden1{
	void config(){
		System.out.println("config method of Overridden1 class");
	}
}