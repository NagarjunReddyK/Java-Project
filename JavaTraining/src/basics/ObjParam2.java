package basics;

public class ObjParam2 {
	 static void login(ObjParam1 obj1){
		 System.out.println("login method in ObjParam2 class");
		 System.out.println(obj1.a);
		 obj1.display();
	 }
	
	public static void main(String[] args) {
		
		//ObjParam2 obj = new ObjParam2();
		//obj.login(new ObjParam1());
		login(new ObjParam1());
	}
}
