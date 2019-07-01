package basics;
// Example3: Calling instance and static variables in instance and static methods
public class MethodsDemo3 {
	int id=123;
	static String name="Test User Name";
	
	void method1(){
		System.out.println("id value: "+id);
		System.out.println("name value: "+MethodsDemo3.name);
	}
	static void method2(){
		MethodsDemo3 obj=new MethodsDemo3();
		System.out.println("id value: "+obj.id);
		System.out.println("name value: "+MethodsDemo3.name);
	}
	
	public static void main(String[] args) {
		MethodsDemo3 obj=new MethodsDemo3();
		obj.method1();
		MethodsDemo3.method2();
		
	}

}
