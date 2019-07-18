package polymorphism;

public class OverloadingQ {
	public static void sum(Integer x,Integer y){
		System.out.println("Integer sum is: "+(x+y));
	}
	public static void sum(double x,double y){
		System.out.println("double sum is: "+(x+y));
	}
	public static void sum(float x,float y){
		System.out.println("float sum is: "+(x+y));
	}
	public static void sum(int x,int y){
		System.out.println("int sum is: "+(x+y));
	}
	
	public static void main(String[] args) {
		sum(10,20);
		//sum(10.00,20.00);
	}

}

/*
 what is the result?
 A. int sum is: 30
 	double sum is: 30.0
 	
 B. int sum is: 30
 	float sum is: 30.00
 	
C. Integer sum is: 30
	double sum is: 30.0
	
D. Integer sum is:30
	float sum is: 30.0 
 
 
 */
