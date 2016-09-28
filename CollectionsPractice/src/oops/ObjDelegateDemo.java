package oops;

public class ObjDelegateDemo {

	public static void main(String[] args) {
		Common common = new Common();
		common.click();
	}

}
class Reusable{
	void click(){
		System.out.println("Performed click action successfully...");
	}
}
class Common{
	Reusable r = new Reusable();
	void click(){
		r.click();
	}
}