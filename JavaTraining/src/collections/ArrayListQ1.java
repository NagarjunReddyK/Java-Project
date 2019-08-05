package collections;

import java.util.ArrayList;

public class ArrayListQ1 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		//al.remove(2);
		//al.remove(new Integer(2));
		al.remove(al.indexOf(2));
		System.out.println(al);
	}
}

/*
What is the result?
A. [1,2,4,5]
B. [1,3,4,5]
C. Compilation Fails
D. NullPointerException is thrown at runtime


*/