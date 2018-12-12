package basics;

public class ObjectDemo {
	int a=10,b=20;
	void addition(){
		System.out.println("Sum is: "+(a+b));
	}

	public static void main(String[] args) {
		ObjectDemo o1=new ObjectDemo();
		ObjectDemo o2=new ObjectDemo();
		o1=null;
		o2.addition();
		o1.addition();   //java.lang.NullPointerException

	}

}
