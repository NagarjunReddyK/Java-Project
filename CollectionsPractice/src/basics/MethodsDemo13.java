package basics;

public class MethodsDemo13 {
	int add(int a, int b){
		System.out.println("--- add method ---");
		System.out.println(a+" --- "+b);
		return a+b;
	}
	boolean isValid(String username, String password){
		System.out.println("--- isValid method ---");
		System.out.println(username+" --- "+password);
		return true;
	}
	static String showText(int row,String username){
		System.out.println("--- showText method ---");
		System.out.println(row+" --- "+username);
		return username;
	}
	public static void main(String[] args){
		MethodsDemo13 obj = new MethodsDemo13();
		int sum=obj.add(10, 20);
		System.out.println("add() return value is: "+sum);
		
		boolean result=obj.isValid("nkasu@xtglobal.com", "xeno@123");
		System.out.println("isValid() return value is: "+result);
		
		String user=MethodsDemo13.showText(1, "nkasu@xeno.com");
		System.out.println("showText() return value is: "+user);
	}

}
