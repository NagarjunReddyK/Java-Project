package basics;

public class Test3 {
	static void login(){
		System.out.println("Login");
	}
	static void searchProduct(){
		System.out.println("Search for Product");
	}
	static void selectProduct(){
		System.out.println("Select Product");
	}
	static void billing(){
		System.out.println("Billing information");
	}
	//template method
	static void purchase(){
		System.out.println("--- Template Method ---");
		login();
		searchProduct();
		selectProduct();
		billing();
	}
	public static void main(String[] args) {
		purchase();
		System.out.println(new InstanceVariables().name);
	}

}
