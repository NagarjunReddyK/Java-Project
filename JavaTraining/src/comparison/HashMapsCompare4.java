package comparison;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//To verify whether all the values from both HashMaps are equal or not.
public class HashMapsCompare4 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(1, "vendor1");
		hm1.put(2, "vendor2");
		hm1.put(3, "vendor3");
		hm1.put(4, "vendor4");
		
		
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.put(3, "vendor3");
		hm2.put(1, "vendor1");
		hm2.put(4, "vendor4");
		hm2.put(2, "vendor2");
		
		//System.out.println(hm1.values().equals(hm2.values())); //false
		
		//System.out.println(new ArrayList<>(hm1.values()).equals(new ArrayList<>(hm2.values()))); //true

		System.out.println("Are entry sets equal? "+hm1.entrySet().equals(hm2.entrySet()));
	}

}
