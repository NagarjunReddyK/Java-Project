package exceptionhandling;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		try{
			System.out.println("Welcome...!");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("task 1 is completed...");
		}
		catch(NullPointerException ne){
			System.out.println("task 2 is completed...");
		}
		catch(ArrayIndexOutOfBoundsException ar){
			System.out.println("task 2 is completed...");
		}
		catch(Exception e){
			System.out.println("Common task is completed...");
		}
	}

}
