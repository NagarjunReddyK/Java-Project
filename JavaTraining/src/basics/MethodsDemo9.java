package basics;

public class MethodsDemo9 {
	// instance variables
	int a=1000;
	int b=2000;
	void add(int a, int b){ //instance method by passing local variables
		System.out.println(a+b); // local variables addition
		System.out.println(this.a+this.b); // instance variables addition
	}
	public static void main(String[] args){
		MethodsDemo9 obj = new MethodsDemo9();
		obj.add(5, 15);
	}
}
