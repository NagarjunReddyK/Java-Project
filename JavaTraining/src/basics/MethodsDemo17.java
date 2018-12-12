package basics;
//Ex: Return current class object
public class MethodsDemo17 {
	MethodsDemo17 method1(){
		System.out.println("method1");
		MethodsDemo17 obj = new MethodsDemo17();
		return obj;
	}
	MethodsDemo17 method2(){
		System.out.println("method2");
		return this;
	}

	public static void main(String[] args) {
		MethodsDemo17 mObj = new MethodsDemo17();
		MethodsDemo17 obj1 = mObj.method1();
		System.out.println(obj1);
		MethodsDemo17 obj2 = mObj.method2();
		System.out.println(obj2);

	}
}
