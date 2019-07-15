package exceptionhandling;

public class PropagationDemo1 {
	void m1(){
		int value=10/0;
		System.out.println(value);
	}
	void m2(){
		m1();
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
		PropagationDemo1 obj=new PropagationDemo1();
		obj.m4();
		System.out.println("Normal flow of execution...");
	}

}
