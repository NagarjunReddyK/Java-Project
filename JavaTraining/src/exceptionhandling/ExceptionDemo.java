package exceptionhandling;

public class ExceptionDemo {
	void m1() throws InterruptedException{
		Thread.sleep(3000); //Predefined method which throws InterruptedException
	}
	void m2() throws InterruptedException{
		m1();
		System.out.println("m2 method");
	}
	void m3(){
		try{
			m1();
		}
		catch(Exception i){
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws Exception {
		ExceptionDemo obj=new ExceptionDemo();
		obj.m2();
		
	}
}
