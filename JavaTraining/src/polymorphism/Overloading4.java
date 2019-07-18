package polymorphism;

//without type promotion (method with exact params match is available)
public class Overloading4 {
	public void getAmount(int a, double d){
		System.out.println("getAmount method with int & double type of parameters");
	}
	public void getAmount(int a, double d, double c){
		System.out.println("getAmount method with int, double & double type of parameters");
	}
	public void getAmount(int a, float d){
		System.out.println("getAmount method with int & float type of parameters");
	}
	
	public static void main(String[] args) {
		Overloading4 obj=new Overloading4();
		obj.getAmount(100, 20.75f);
	}

}
