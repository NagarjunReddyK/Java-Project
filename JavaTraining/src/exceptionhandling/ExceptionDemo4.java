package exceptionhandling;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		try{
			System.out.println("Welcome...!");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("task 1 is completed...");
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}

}
