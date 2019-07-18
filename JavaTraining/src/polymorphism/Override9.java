package polymorphism;

//Overloading & Overriding with var-arg method m1(int... i)
public class Override9 {
	public static void main(String[] args) {
		Parent9 p=new Parent9();
		p.m1(10);
		
		Child9 c=new Child9();
		c.m1(25);
		
		Parent9 pp=new Child9();
		pp.m1(35);
	}

}


class Parent9{
	public void m1(int... i){
		System.out.println("Parent method");
	}
}

class Child9 extends Parent9{
	/*public void m1(int i){  //Overloading: method resolution always takes care by compiler based on reference type. Hence output is Parent, Child, Parent
		System.out.println("Child method");
	}*/
	
	public void m1(int... i){  //Overriding: method resolution always takes care by jvm based on runtime object. Hence output is Parent,Child,Child
		System.out.println("Child method...");
	}
}
