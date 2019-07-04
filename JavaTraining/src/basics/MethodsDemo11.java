package basics;

public class MethodsDemo11 {
	static int a=100;
	static void add(int a){
		//System.out.println(this.a);
		System.out.println("static method");
	}
	
	public static void main(String[] args){
		MethodsDemo11.add(15);
	}
}
