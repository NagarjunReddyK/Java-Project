package exceptionhandling;

public class ThrowDemo2 {
	void verify(int dbCount) throws InvalidCountException{
		int appCount=50;
		if(appCount==dbCount){
			System.out.println("Count of records from app and db are equal.");
		}
		else
			throw new InvalidCountException("Records count doesn't match...");
	}
	public static void main(String[] args) throws InvalidCountException {
		ThrowDemo2 obj=new ThrowDemo2();
		obj.verify(52);
	}

}
