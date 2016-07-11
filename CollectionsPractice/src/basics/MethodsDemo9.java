package basics;

public class MethodsDemo9 {
	// instance variables
	int a=1000;
	int b=2000;
	void add(int i, int j){ //instance method by passing local variables
		System.out.println(i+j); // local variables addition
		System.out.println(a+b); // instance variables addition
	}
	public static void main(String[] args){
		MethodsDemo9 obj = new MethodsDemo9();
		obj.add(5, 15);
	}

}
