package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo3 {
	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("Vendor4");
		al.add("Vendor2");
		al.add("Vendor1");
		ListIterator<String> lstr = al.listIterator();
		System.out.println("Printing data in forward direction");
		while(lstr.hasNext())
		{ System.out.println(lstr.next());
		}
		System.out.println("Printing data in backward direction");
		while(lstr.hasPrevious())
		{ System.out.println(lstr.previous());
		}
	}
}
