package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
//Ex: HashSet with Cursor
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Vendor1");
		h.add("Vendor2");
		h.add("Vendor3");
		h.add("Vendor4");
		h.add("Vendor5");
		h.add(null);
		h.add(null);
		//creation of Iterator Object
		Iterator<String> itr = h.iterator();
		while (itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}
	}

}
