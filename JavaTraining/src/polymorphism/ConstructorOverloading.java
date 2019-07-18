package polymorphism;

public class ConstructorOverloading {
	
	String username,password;
	ConstructorOverloading() {
		System.out.println("User-defined 0-arg constructor");
	}

	ConstructorOverloading(float i) {
		System.out.println("User-defined 1-arg int constructor");
	}

	ConstructorOverloading(String str) {
		System.out.println("User-defined 1-arg String constructor");
	}

	ConstructorOverloading(String username, String password) {
		this.username=username;
		this.password=password;
		System.out.println("User-defined 2-arg constructor");
	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading(200);
		ConstructorOverloading obj3=new ConstructorOverloading("nagarjun");
		ConstructorOverloading obj4=new ConstructorOverloading("nagarjun","xeno@123");
		System.out.println(obj3.username+"------"+obj3.password);
		
	}

}
