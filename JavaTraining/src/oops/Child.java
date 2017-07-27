package oops;

public class Child extends Parent {
	void m1(int p,int q){
		System.out.println("Child class m1 method");
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.m1(10,20);
		
	}

}