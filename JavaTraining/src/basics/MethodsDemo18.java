package basics;

//Example 18: Method Recursion
public class MethodsDemo18 {
	static void recursive1(int a){
		System.out.println("Number is: "+a);
		if(a==0){
			return;
		}			
		recursive1(--a); //calling same method within the method
	}

	public static void main(String[] args) {
		MethodsDemo18.recursive1(10);
	}

}
