package basics;

public class TestDemo {
	
	CheckRequest approveCheck(){
		System.out.println("approveCheck method");
		CheckRequest chk=new CheckRequest();
		return chk;
	}
	
	public static void main(String[] args){
		TestDemo obj=new TestDemo();
		CheckRequest c1=obj.approveCheck();
		c1.create();
		System.out.println(c1.a);
		
		
	}

}


class CheckRequest{
	int a=10;
	String create(){
		System.out.println("create method in CheckRequest class.");
		return "create method";
	}
	static void approve(){
		System.out.println("approve method in CheckRequest class");
	}
}