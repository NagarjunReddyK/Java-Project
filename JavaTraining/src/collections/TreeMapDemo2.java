package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("manager", "Murali");
		tm.put("teamlead", "Prasad");
		tm.put("senior", "Senior1");
		tm.put("member", "Chaitanya");
		
		TreeMap<String,String> tm2=new TreeMap<String,String>();
		tm2.putAll(tm);
		tm2.put("junior", "Ravikumar");
		
		//Printing elements using for-each loop
		for(Map.Entry<String, String> m:tm2.entrySet()){
			System.out.println(m.getKey()+"---"+m.getValue());
			}
		
		if(tm2.containsKey("member"))
			System.out.println("Specified key is present.");
		if(tm2.containsValue("Prasad"))
			System.out.println("Specified value is present.");
		
		//Printing all the Keys
		System.out.println("----- All the Keys-----");
		Set<String> s=tm2.keySet();
		for(String str:s)
			System.out.println(str);
		
		//Printing all the values
		System.out.println("----- All the Values-----");
		Collection<String> v=tm2.values();
		for(String st:v)
			System.out.println(st);
		
		System.out.println("----- All the Entries-----");
		Set<Entry<String,String>> ss=tm2.entrySet();
		for(Entry<String,String> ss2:ss)
			System.out.println(ss2);
		
		tm2.clear();
		System.out.println(tm2);
		
	}
}
