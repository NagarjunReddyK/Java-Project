package polymorphism;

public class Covariant extends OverrideParent{
	Search m1(){  //overriding m1 method with sub/child class type 'Search' of parent class SignIn (co-variance) 
		System.out.println("Child m1 method");
		return new Search();
	}
	public static void main(String[] args) {
		OverrideParent p=new OverrideParent();
		p.m1();
		
		Covariant c=new Covariant();
		c.m1();
		
		OverrideParent pp=new Covariant();
		pp.m1();
	}
}
// parent class
class OverrideParent{
	SignIn m1(){
		System.out.println("Parent m1 method");
		return new SignIn();
	}
}
//other classes with inheritance
class SignIn{	
}
class Search extends SignIn{
}
