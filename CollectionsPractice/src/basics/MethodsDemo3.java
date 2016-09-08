package basics;

public class MethodsDemo3 {
	void login1(Dashboard db){
		System.out.println("login1 instance method with object as parameter");
		db.dash();
		//System.out.println(db.a);
	}
	static void login2(ApproveBills approve,PayBills pay){
		System.out.println("login2 static method with two objects as parameters");
		approve.approve();
		pay.pay();
	}
	public static void main(String[] args){
		MethodsDemo3 obj = new MethodsDemo3();
		Dashboard db = new Dashboard();
		ApproveBills approve = new ApproveBills();
		PayBills pay = new PayBills();
		obj.login1(db); // calling instance method by passing object as input
		MethodsDemo3.login2(approve, pay); // calling static method by passing objects as input
		
		/*//main method code at real time project level
		new MethodsDemo3().login1(new Dashboard());
		MethodsDemo3.login2(new ApproveBills(), new PayBills());*/
	}

}

class Dashboard{
	//int a=10;
	void dash(){
		System.out.println("Method from Dashboard class");
	}
	
}

class ApproveBills{
	void approve(){
		System.out.println("Method from Approve Bills class. ");
	}
	
}

class PayBills{
	void pay(){
		System.out.println("Method from PayBills class.");
	}
	
}