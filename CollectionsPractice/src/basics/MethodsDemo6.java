package basics;

// Java does not support inner method concept

public class MethodsDemo6 {
	void display(){
		/*void show(){ //inner method not possible
			System.out.println("Inner method show()");
		}*/
		System.out.println("Outer method display()");
	}
	public static void main(String[] args){
		MethodsDemo6 obj = new MethodsDemo6();
		obj.display();
	}

}
