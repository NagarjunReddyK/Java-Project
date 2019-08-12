package collections;

import java.util.HashMap;
import java.util.Map;
//
public class HashMap7 {
	public static void main(String[] args) {
		HashMap<String,String> hm =new HashMap<String,String>();
		hm.put("username", "Nagarjun");
		hm.put("password", "test@123");
		
		// Copy the entries from one map to other map
		HashMap<String,String> hm2 =new HashMap<String,String>();
		hm2.putAll(hm);
		hm2.put("company", "QA Company");
		
		for(Map.Entry<String, String> m:hm2.entrySet()){
			System.out.println(m.getKey()+"---"+m.getValue());
		}
	}

}
