package polymorphism;
//2. Overloading – Difference in data type of parameters
public class Overloading2 {
	public void getAmount(int a){
		System.out.println("int argument method: "+a);
	}
	public void getAmount(String amount){
		System.out.println("String argument method: "+amount);
	}
	public void getAmount(double d){
		System.out.println("double argument method: "+d);
	}

	public static void main(String[] args) {
		Overloading2 obj=new Overloading2();
		obj.getAmount(100);
		obj.getAmount("Amount is 200");
		obj.getAmount(250.75);
	}
}
