package collections;

import java.util.TreeSet;
//TreeSet methods
public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("Vendor5");
		t.add("Vendor2");
		t.add("Vendor4");
		t.add("Vendor1");
		t.add("Vendor3");
		System.out.println(t);
		
		//System.out.println(t.headSet("Vendor4"));
		//System.out.println(t.tailSet("Vendor4"));
		//System.out.println(t.subSet("Vendor2", "Vendor4"));
		
		//System.out.println(t.first());
		//System.out.println(t.last());
		
		//System.out.println(t.lower("Vendor4"));
		//System.out.println(t.higher("Vendor4"));
		
		//System.out.println(t.remove("Vendor3"));
		
		System.out.println("Print and Remove first element:"+t.pollFirst());
		System.out.println("Print and Remove last element:"+t.pollLast());
		System.out.println(t);
		
		/*System.out.println(t.headSet("Vendor4"));
		System.out.println(t.tailSet("Vendor4"));
		System.out.println(t.subSet("Vendor2", "Vendor4"));
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t.lower("Vendor4"));
		System.out.println(t.higher("Vendor4"));
		System.out.println("Size="+t.size());
		System.out.println(t.remove("Vendor3"));
		System.out.println("Size="+t.size());
		System.out.println("Print and Remove first element:"+t.pollFirst());
		System.out.println("Print and Remove last element:"+t.pollLast());
		System.out.println(t);*/
	}
}
