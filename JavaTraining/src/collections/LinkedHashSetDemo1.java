package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {
	public static void main(String[] args) {
		Set<String> h = new LinkedHashSet<String>();
		h.add("Vendor4");
		h.add("Vendor2");
		h.add("Vendor5");
		h.add("Vendor1");
		h.add("Vendor3");
		Iterator<String> itr = h.iterator();
		while (itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}
	}

}
