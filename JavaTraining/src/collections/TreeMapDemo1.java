package collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("manager", "Murali");
		t.put("teamlead", "Prasad");
		t.put("senior", "Senior1");
		t.put("member", "Chaitanya");
		
		for(Map.Entry<String, String> m:t.entrySet()){
			System.out.println(m.getKey()+"---"+m.getValue());
			}
	}

}
