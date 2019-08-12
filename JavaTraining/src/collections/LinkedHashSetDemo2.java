package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {
	public static void main(String[] args) {
		HashSet<String> h1 = new LinkedHashSet<String>();
		h1.add("Vendor4");
		h1.add("Vendor2");
		h1.add("Vendor5");
		h1.add("Vendor1");
		h1.add("Vendor3");
		
		HashSet<String> h2 = new LinkedHashSet<String>();
		h2.add("Vendor6");
		h2.addAll(h1);
		
		System.out.println(h2);
		
	}

}
