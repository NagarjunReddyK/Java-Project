package basics;

public class MethodsDemo7 {
	void method1(byte a){
		System.out.println("Byte value ---> "+a);
	}
	void method2(short b){
		System.out.println("Short value ---> "+b);
	}
	void method3(int c){
		System.out.println("Int value ---> "+c);	
	}
	void method4(long d){
		System.out.println("Long value ---> "+d);	
	}
	void method5(float e){
		System.out.println("Float value ---> "+e);	
	}
	void method6(double f){
		System.out.println("Double value ---> "+f);
	}
	void method7(char g){
		System.out.println("Char value ---> "+g);
	}
	void method8(boolean h){
		System.out.println("Boolean value ---> "+h);
	}
	public static void main(String[] args){
		MethodsDemo7 obj = new MethodsDemo7();
		obj.method1((byte)10);
		obj.method2((short)15);
		obj.method3(30);
		obj.method4((long)10000);
		obj.method5(10.5f);
		obj.method6(75.50);
		obj.method7('K');
		obj.method8(true);
	}

}
