package oops;

public class SuperConstrctorsDemo2 extends ParentDemo{
	SuperConstrctorsDemo2(){
		//super(); //compiler generates at compilation time
		System.out.println("Current class 0-arg constructor");
	}
	SuperConstrctorsDemo2(int age){
		//super(); //compiler generates at compilation time
		System.out.println("Current class 1-arg constructor");
	}
	public static void main(String[] args) {
		new SuperConstrctorsDemo2();
		new SuperConstrctorsDemo2(10);
	}
}
