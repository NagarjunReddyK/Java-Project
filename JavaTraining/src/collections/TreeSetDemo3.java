package collections;

import java.util.TreeSet;
//Adding one TreeSet objects into another TreeSet
public class TreeSetDemo3 {
	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Vendor4");
		t1.add("Vendor2");
		t1.add("Vendor5");
		t1.add("Vendor1");
		t1.add("Vendor3");
		//t1.add(null);
		
		TreeSet<String> t2 = new TreeSet<String>(t1);
		t2.add("Vendor6");
		
		System.out.println(t2);
	}

}
