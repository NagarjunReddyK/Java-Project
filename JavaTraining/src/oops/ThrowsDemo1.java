package oops;

public class ThrowsDemo1 {
	void m1() throws InterruptedException{
		System.out.println("m1 method");
	}
	void m2() throws InterruptedException{
		m1();
		System.out.println("m2 method");
	}
	
	void me3(){
		try{
			m1();
		}
		catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThrowsDemo1 obj=new ThrowsDemo1();
		obj.m2();
		obj.me3();
	}

}
