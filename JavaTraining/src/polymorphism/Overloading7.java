package polymorphism;

//Type promotion with exception
public class Overloading7 {
	public void m1(int i, float f){
		System.out.println("int-float version");
	}
	public void m1(float f, int i){
		System.out.println("float-int version");
	}
	
	public static void main(String[] args) {
		Overloading7 obj=new Overloading7();
		obj.m1(10, 12.50f);
		obj.m1(12.50f,10);
		//obj.m1(10, 10); //Compile Exception: The method m1(int, float) is ambiguous for the type Overloading7
		//obj.m1(10.5f, 10.8f); //The method m1(float, int) in the type Overloading7 is not applicable for the arguments (float, float)
	}

}
