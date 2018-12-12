package basics;

public class NestedIfDemo {

	public static void main(String[] args) {
		int a=10,b=20;
		if(a==10){
			if(b==20){
				System.out.println("a value is 10 and b value is 20");
			}
			else{
				System.out.println("This is else statement1");
			}
		}
		else if(a==20){
			if(b==30){
				System.out.println("a value is 20 and b value is 30");
			}
			else{
				System.out.println("This is else statement2");
			}
		}
		else{
			System.out.println("This is final else statement");
		}
	}

}
