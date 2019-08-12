package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Cursor
public class HashMap6 {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		//System.out.println("HashMap size before adding countries: " + hmCountry.size());
		// adding elements to the HashMap//
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
		// System.out.println("HashMap size after adding countries: " + hm.size());

		// System.out.println(hm);

		//display the HashMap content using Iterator
		/*System.out.println("---- Using Iterator cursor----");
		Set<Entry<String, String>> set= hm.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> ent= itr.next();
			System.out.println("Key: "+ent.getKey()+", Value: "+ent.getValue());
		}*/
		/*//display the HashMap content using for each loop
		System.out.println("---- Using for each loop----");
		for(Map.Entry<String, String> m:hm.entrySet()){
			System.out.println("Key: "+m.getKey()+", Value: "+m.getValue());
			
		}*/

		//Since Java 8 with Lambda expressions and the forEach() statement, iterating over a Map is as easy as:
		System.out.println("---- Using Lambda expression in java 8----");
		hm.forEach((code,country) -> System.out.println(code +"="+country));

	}

}
