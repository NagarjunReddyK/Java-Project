package polymorphism;
//Type Promotion (int to float)
public class Overloading5 {
	public void getAmount(double a){
		System.out.println("getAmount method with double parameter "+a);
	}
	public void getAmount(float a){
		System.out.println("getAmount method with float parameter "+a);
	}
	public void getAmount(short a){
		System.out.println("getAmount method with short parameter "+a);
	}
	
	public static void main(String[] args) {
		Overloading5 obj=new Overloading5();
		obj.getAmount(10);//float
		obj.getAmount(10.25);//double
		obj.getAmount((byte)10);//short
		obj.getAmount((short)10);//short
		obj.getAmount(800l);//float
		obj.getAmount(10.25f);//float
		
	}

}
