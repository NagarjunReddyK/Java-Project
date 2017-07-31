package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo3 {
	public static void main(String[] args) {
		LinkedHashMap<String,String> hm =new LinkedHashMap<String,String>();
		hm.put("username", "Nagarjun");
		hm.put("password", "test@123");
		
		// Copy the values from one map to other map
		LinkedHashMap<String,String> hm2 =new LinkedHashMap<String,String>(hm);
		hm2.put("company", "QA Company");
		
		for(Map.Entry<String, String> m:hm2.entrySet()){
			System.out.println(m.getKey()+"---"+m.getValue());
		}
	}

}
