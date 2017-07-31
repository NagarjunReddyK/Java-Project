package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("manager", "Murali");
		tm.put("teamlead", "Prasad");
		tm.put("senior", "Senior1");
		tm.put("member", "Chaitanya");
		tm.put("junior", "Ravikumar");
		
		System.out.println(tm);
		
		Map<String, String> m=tm.subMap("member", "teamlead");
		System.out.println(m);
		
		Map<String, String> hm=tm.headMap("member");
		System.out.println(hm);
		Map<String, String> tl=tm.tailMap("member");
		System.out.println(tl);
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.lowerKey("senior"));
		System.out.println(tm.higherKey("senior"));
	}

}
