package comparison;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

//Concurrent HashMap
public class HashMapsCompare7 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> hm1=new ConcurrentHashMap<Integer,String>();
		hm1.put(1, "vendor1");
		hm1.put(2, "vendor2");
		hm1.put(3, "vendor3");
		hm1.put(4, "vendor4");
		
		
		ConcurrentHashMap<Integer,String> hm2=new ConcurrentHashMap<Integer,String>();
		hm2.put(3, "vendor3");
		hm2.put(1, "vendor1");
		hm2.put(4, "vendor4");
		hm2.put(2, "vendor2");
		hm2.put(5, "vendor5");
		
		Set<Entry<Integer, String>> entries=hm1.entrySet();
		Iterator<Entry<Integer, String>> itr= entries.iterator();
		while(itr.hasNext()){
			Entry<Integer, String> entry=itr.next();
			if(hm2.remove(entry.getKey(),entry.getValue())){
				hm1.remove(entry.getKey());
			}
		}
		
		HashMap<Integer,String> unmatched=new HashMap<>(hm1);
		unmatched.putAll(hm2);
		System.out.println(unmatched);
		
	}

}
