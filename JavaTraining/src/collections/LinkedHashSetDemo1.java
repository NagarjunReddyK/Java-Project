package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;
// LinkedHashSet with Cursors Iterator & Spliterator
public class LinkedHashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> h = new LinkedHashSet<String>();
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
		
		Spliterator<String> spl=h.spliterator();
		spl.forEachRemaining(System.out::println);
		
	}

}
