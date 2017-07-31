package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		//Adding elements to the ArrayList
		obj.add("Vendor5");
		obj.add("Vendor2");
		obj.add("Vendor4");
		obj.add("Vendor1");
		obj.add("Vendor3");
		//displaying array list elements
		System.out.println("Current Array List is : "+obj);
		
		//add element at the given index
		obj.add(0, "Vendor6");
		System.out.println("Current Array List is : "+obj);
		
		//remove element
		//obj.remove("Vendor1");
		obj.remove(4);
		System.out.println("Current Array List is : "+obj);
		
		//update element at given index
		obj.set(2, "Test Vendor");
		System.out.println("Current Array List is : "+obj);
		//to check whether the array list is empty or not (it returns either true or false)
		obj.clear();
		System.out.println(obj.isEmpty());
	}

}
