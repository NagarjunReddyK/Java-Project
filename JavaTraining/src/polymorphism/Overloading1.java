package polymorphism;
//1. Overloading – Different Number of parameters in argument list
public class Overloading1 {
	public void click(){
		System.out.println("click method without parameters...");
	}
	public void click(String locator){
		System.out.println("click method with ONE parameter...");
	}
	public void click(String locator, String type){
		System.out.println("click method with TWO parameters...");
	}
	public static void main(String[] args) {
		Overloading1 obj=new Overloading1();
		obj.click();
		obj.click("txtEmail");
		obj.click("txtEmail", "id");
	}

}
