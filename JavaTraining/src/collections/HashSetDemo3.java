package collections;

import java.util.HashSet;

public class HashSetDemo3 {
	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();
		h1.add("Vendor1");
		h1.add("Vendor2");
		h1.add("Vendor3");
		
		HashSet<String> h2 = new HashSet<String>(h1);
		h2.add("Vendor4");
		h2.add("Vendor5");
		System.out.println(h2);
	}
}
