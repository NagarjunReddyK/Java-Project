package oops;

public class Override2 extends Overridden2{
	Dashboard m1(){
		System.out.println("m1 method in Override2 class");
		return new Dashboard();
	}
	public static void main(String[] args) {
		Overridden2 o=new Overridden2();
		Login l=o.m1();
		
		Override2 obj=new Override2();
		Dashboard d=obj.m1();
		
	}

}

class Overridden2{
	Login m1(){
		System.out.println("m1 method in Overridden2 class");
		return new Login();
	}
}

class Login{
	
}

class Dashboard extends Login{
	
}
