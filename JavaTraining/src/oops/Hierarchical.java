package oops;

public class Hierarchical {
	public static void main(String[] args) {
		H2 h2=new H2();
		h2.m1();
		h2.m2();
		
		H3 h3=new H3();
		h3.m1();
		h3.m3();

	}
}

class H1{
	void m1() {
		System.out.println("H1 class-m1 method...");

	}
}

class H2 extends H1{
	void m2() {
		System.out.println("H2 class-m2 method...");

	}
}

class H3 extends H1{
	void m3() {
		System.out.println("H3 class-m3 method...");

	}
}