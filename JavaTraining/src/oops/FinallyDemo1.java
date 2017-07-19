package oops;

public class FinallyDemo1 {
	public static void main(String[] args) {
		try{
			int value=25/5;
			System.out.println(value);
		}
		catch(NullPointerException ne){
			System.out.println(ne);
		}
		finally{
			System.out.println("finally block is always executed.....!");
		}
		System.out.println("rest of the code......");
	}
}
