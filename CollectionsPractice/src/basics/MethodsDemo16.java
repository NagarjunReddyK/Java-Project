package basics;

public class MethodsDemo16 {
	ApproveDocs review(){
		System.out.println("review method");
		ApproveDocs app=new ApproveDocs();
		return app;
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
		//ap.approve();
		PayDocs pd = obj.approveDoc();
		System.out.println("approveDoc method return value ---> "+pd);
		//pd.pay();
		String str = MethodsDemo16.result();
		System.out.println("result method return value ---> "+str);

	}

}

class ApproveDocs{
	void approve(){
		System.out.println("approve method");
	}
}

class PayDocs{
	void pay(){
		System.out.println("pay method");
	}
	
}
