package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMap2 {
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

		//display the LinkedHashMap content using Iterator
		System.out.println("---- Using Iterator cursor----");
		Set<Entry<String, String>> set=hm.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> ent=itr.next();
			System.out.println("Key: "+ent.getKey()+", Value: "+ent.getValue());

		}
		// display using for each loop
		System.out.println("---- Using for each loop----");
		for(Map.Entry<String, String> m:hm.entrySet()){
			System.out.println("Key: "+m.getKey()+", Value: "+m.getValue());
		}
	}

}
