package polymorphism;

// Var-arg method m1(int... i) --> it can take any number of int arguments
public class Overloading6 {
	public void m1(int i){
		System.out.println("General Method");
	}
	public void m1(int... i){
		System.out.println("int Var-arg Method");
	}
	
	public static void main(String[] args) {
		Overloading6 ref=new Overloading6();
		ref.m1(10);
		ref.m1(111,222);
		ref.m1(25,75,100);
		
	}

}
