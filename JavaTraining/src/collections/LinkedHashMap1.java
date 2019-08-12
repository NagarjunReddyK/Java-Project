package collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
//
public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> hm=new LinkedHashMap<String, String>();
		System.out.println("HashMap size before adding countries: " + hm.size());
		// adding elements to the HashMap
		hm.put("SP","Spain");
		hm.put("GE","Germany");
		hm.put("FR","France");
		hm.put("CN","China");
		hm.put("US","United States");
		hm.put("RU","Russia");
		hm.put("GB","United Kingdom ");
		hm.put("IN","India");
		hm.put("BR","Brazil");
		hm.put("SA","South Africa");
		hm.put(null,"India");
		System.out.println("HashMap size after adding countries: " + hm.size());

		System.out.println(hm);

		//To get all the keys
		System.out.println("-----All the keys-----");
		Set<String> st=hm.keySet();
		for(String s:st)
			System.out.println(s);

		// To display all values
		System.out.println("-----All the values-----");
		Collection<String> c=hm.values();
		for(String str:c)
			System.out.println(str);

		//To get all the entries
		System.out.println("----- All the Entries-----");
		Set<Entry<String,String>> entries=hm.entrySet();
		for(Entry<String,String> entry:entries)
			System.out.println(entry);
	}

}
