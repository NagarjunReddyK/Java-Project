package collections;

import java.util.LinkedHashMap;
import java.util.Map;
//Copying one LinkedHashMap objects in another LinkedHashMap
public class LinkedHashMap3 {
	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm =new LinkedHashMap<String,String>();
		lhm.put("username", "Nagarjun");
		lhm.put("password", "test@123");
		
		// Copy the values from one map to other map
		LinkedHashMap<String,String> lhm2 =new LinkedHashMap<String,String>(lhm);
		lhm2.put("company", "QA Company");
		
		for(Map.Entry<String, String> m:lhm2.entrySet()){
			System.out.println(m.getKey()+"---"+m.getValue());
		}
	}

}
