package basics;

public class MethodsDemo19 {
	static void recursive(int a){
		System.out.println("Number is: "+a);
		if(a==0)
			return;
		recursive(--a);
	}

	public static void main(String[] args) {
		MethodsDemo19.recursive(10);

	}

}
