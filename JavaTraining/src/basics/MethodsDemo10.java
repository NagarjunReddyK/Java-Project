package basics;

public class MethodsDemo10 {
	int a=100;
	int b=200;
	void add(int a, int b){ //instance method by passing local variables
		System.out.println(a+b); // local variables addition
		System.out.println(this.a+this.b); //instance variables addition
	}
	public static void main(String[] args){
		MethodsDemo10 obj = new MethodsDemo10();
		obj.add(5, 15);
	}

}
