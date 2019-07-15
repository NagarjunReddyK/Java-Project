package inheritance;

public class Child001 extends Parent001 {
	int a=25;
	void sendKeys(){
		System.out.println("sendKeys method from Child class");
	}
	void click(){
		System.out.println("click method from Child class");
		System.out.println("a value: "+super.a);
		System.out.println("a value: "+this.a);
	}
	static void getText(){
		System.out.println("getText method from Child class");
	}
	
	public static void main(String[] args) {
	
		Parent001 p=new Child001();
		p.click();
		System.out.println("a value: "+p.a);
		System.out.println("a value: "+new Child001().a);
		
		
		
	}

}