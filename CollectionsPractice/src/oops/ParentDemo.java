package oops;
class ParentDemo{
	String username,password;
	ParentDemo(String username,String password){
		this.username=username;
		this.password=password;
	}
	ParentDemo(){
		System.out.println("Parent 0-arg constructor");
	}
	ParentDemo(int age){
		System.out.println("Parent 1-arg constructor");
	}
		void parentMethod1(){
			System.out.println("This is parentMethod1");
		}
		void login1(){
			System.out.println("Parent class login1 method");
		}
		static void parentMethod2(){
			System.out.println("This is parentMethod2");
		}
}

