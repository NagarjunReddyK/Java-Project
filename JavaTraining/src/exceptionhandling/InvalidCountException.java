package exceptionhandling;

public class InvalidCountException extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidCountException(String str){
		super(str);
	}
	

}
