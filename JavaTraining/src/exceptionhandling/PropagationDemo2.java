package exceptionhandling;

public class PropagationDemo2 {
	void m1(){
		int value=10/0;
		System.out.println(value);
	}
	void m2(){
		try{
			m1();
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
	}	
	void m3(){
		m2();
	}
	void m4(){
		try{
			m3();
		}
		catch(Exception e){
			System.out.println("Exception handled in m4 method...");
		}
		
	}
	public static void main(String[] args) {
		PropagationDemo2 obj=new PropagationDemo2();
		obj.m4();
		System.out.println("Normal flow of execution...");
	}
}
