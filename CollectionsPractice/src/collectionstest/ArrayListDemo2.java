package collectionstest;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		//Adding elements to the ArrayList
		obj.add("Prasad");
		obj.add("Mohan");
		obj.add("Chaitanya");
		obj.add("Srinivas");
		obj.add("Nagarjun");
		//displaying array list elements
		System.out.println("Current Array List is : "+obj);
		
		//add element at the given index
		obj.add(0, "Murali");
		System.out.println("Current Array List is : "+obj);
		
		//remove element
		obj.remove("Nagarjun");
		obj.remove(4);
		System.out.println("Current Array List is : "+obj);
		
		//update element at given index
		obj.set(2, "Srihari");
		System.out.println("Current Array List is : "+obj);
		//to check whether the array list is empty or not (it returns either true or false)
		System.out.println(obj.isEmpty());
	}
}
