package basics;

public class MethodsDemo16 {
	ApproveDocs review(){
		System.out.println("review method");
		//ApproveDocs app=new ApproveDocs();
		return new ApproveDocs();
	}
	PayDocs approveDoc(){
		System.out.println("approveDoc method");
		PayDocs py=new PayDocs();
		return py;
	}
	static String result(){
		System.out.println("result method");
		return "PASS";
	}
	public static void main(String[] args) {
		MethodsDemo16 obj = new MethodsDemo16();
		ApproveDocs ap = obj.review();
		System.out.println("review method return value ---> "+ap);
		System.out.println("a value is: "+ap.a);
		ap.approve();
		
		PayDocs pd = obj.approveDoc();
		System.out.println("approveDoc method return value ---> "+pd);
		pd.pay();
		System.out.println("x value is: "+pd.x);
		
		String str = MethodsDemo16.result();
		System.out.println("result method return value ---> "+str);

	}

}

/*class ApproveDocs{
	int a=20;
	void approve(){
		System.out.println("approve method");
	}
}*/


class PayDocs{
	int x=111;
	void pay(){
		System.out.println("pay method");
	}
	
}
