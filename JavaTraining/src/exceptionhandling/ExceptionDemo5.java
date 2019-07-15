package exceptionhandling;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		try{
			System.out.println("Welcome...!");
			System.out.println(10/0);
		}
		catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ae){
			System.out.println("task 1 is completed...");
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}

}
