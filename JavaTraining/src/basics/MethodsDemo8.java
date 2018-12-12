package basics;

//Ex:8 java method calling

public class MethodsDemo8 {
	void method1(){
		method2(); //calling method2()
		System.out.println("method1");
	}
	void method2(){
		method3(111); //calling method3()
		System.out.println("method2");
		method3(222); //calling method3()
	}
	void method3(int id){
		System.out.println("method3 --->id is: "+id);
	}
	
	public static void main(String[] args){
		MethodsDemo8 obj = new MethodsDemo8();
			obj.method1(); //calling method1()
	}

}
