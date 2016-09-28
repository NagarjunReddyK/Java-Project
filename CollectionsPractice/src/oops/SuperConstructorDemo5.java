package oops;

public class SuperConstructorDemo5 extends Parent{
	int a;
	SuperConstructorDemo5(int a,int b,int c){
		super(b,c);
		this.a=a;
	}
	void display(){
		System.out.println("SuperConstructorDemo5: "+a);
		System.out.println("Parent class: "+b);
		System.out.println("Grand parent class: "+c);
	}
	public static void main(String[] args) {
		new SuperConstructorDemo5(10,20,30).display();
	}

}

class GrandParent{
	int c;
	GrandParent(int c){
		this.c=c;
	}
}
class Parent extends GrandParent{
	int b;
	Parent(int b, int c){
		super(c);
		this.b=b;
	}
}