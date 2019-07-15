package exceptionhandling;

public class ThrowDemo1 {
	void verify(int dbCount) throws Exception{
		int appCount=50;
		if(appCount==dbCount){
			System.out.println("Count of records from app and db are equal.");
		}
		else
			throw new Exception("Records are NOT matched.");
	}
	public static void main(String[] args) throws Exception {
		ThrowDemo1 obj=new ThrowDemo1();
		obj.verify(52);
	}

}
