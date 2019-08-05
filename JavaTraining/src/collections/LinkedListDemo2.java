package collections;

import java.util.ArrayList;
import java.util.LinkedList;

//Ex: To Add one collection data into another Collection.//

public class LinkedListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vendor1");
		al.add("Vendor2");
		
		LinkedList<String> linked = new LinkedList<String>(al);
		//linked.addAll(al);
		linked.add("Vendor3");
		linked.add("Vendor4");
		System.out.println(linked);
	}

}
