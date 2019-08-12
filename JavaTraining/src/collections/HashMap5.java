package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMap5 {
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
		//System.out.println("HashMap size after adding countries: " + hm.size());

		//System.out.println(hm);

		/*//To get all the keys
		System.out.println("----- All the Keys-----");
		Set<String> st=hm.keySet();
		for(String s:st){
			System.out.println(s);
		}*/
		
		//To get all the keys in Java 8 (From Java 8, we can use a Java Stream to iterate the keys of a Java Map. )
		//hm.keySet().stream().forEach((value)->System.out.println(value));


		/*//To get all the values
		System.out.println("----- All the Values-----");
		Collection<String> c=hm.values();
		for(String str:c)
			System.out.println(str);*/
		
		//To get all the values in Java 8
		//hm.values().stream().forEach((qwe)->System.out.println(qwe));

		//To get all the entries
		System.out.println("----- All the Entries-----");
		Set<Entry<String,String>> entries=hm.entrySet();
		for(Entry<String,String> entry:entries)
			System.out.println(entry);
	}

}
