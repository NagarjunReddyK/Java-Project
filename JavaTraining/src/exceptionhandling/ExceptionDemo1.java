package exceptionhandling;

public class ExceptionDemo1 {	
	public static void main(String[] args) {
		try{
		System.out.println("Welcome... ! ");
		System.out.println(10/0);
		System.out.println("after exception...");
		}
		catch(ArithmeticException ae){
		System.out.println("Test case passed...");
		System.out.println("Rest of the code");
		}
		System.out.println("rest of the code.");
	}

}
