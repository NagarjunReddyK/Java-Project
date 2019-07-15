package exceptionhandling;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try{
			System.out.println("welcome..!");
			System.out.println(10/0);
		}
		catch(NullPointerException e){
			System.out.println(10/2);
		}
		System.out.println("rest of the code...");
	}

}
