package basics;

public class MethodsDemo18 {
	void login(){
		System.out.println("Login");
	}
	void searchProduct(){
		System.out.println("Search for Product");
	}
	void selectProduct(){
		System.out.println("Select Product");
	}
	void billing(){
		System.out.println("Billing information");
	}
	void purchase(){
		System.out.println("--- Template Method ---");
		login();
		searchProduct();
		selectProduct();
		billing();
	}

	public static void main(String[] args) {
		MethodsDemo18 obj = new MethodsDemo18();
		//Normal approach
		obj.login();
		obj.searchProduct();
		obj.selectProduct();
		obj.billing();
		// By using Template method
		obj.purchase(); //this method calls four methods to complete our task	

	}

}
