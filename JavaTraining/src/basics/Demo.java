package basics;

public class Demo {
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
		login();
		searchProduct();
		selectProduct();
		billing();
	}
		
	public static void main(String[] args) {
		
		Demo obj=new Demo();
		obj.purchase();
		
	}

}
