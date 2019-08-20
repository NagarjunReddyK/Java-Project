package comparison;

import java.util.HashMap;
import java.util.HashSet;
//To retrieve unmatched keys from first HashMap after comparing with second HashMap
//To retrieve unmatched keys from second HashMap after comparing with first HashMap
public class HashMapsCompare3 {
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
		hm2.put(5, "vendor5");
		
		HashSet<Integer> hs=new HashSet<Integer>(hm1.keySet());
		hs.addAll(hm2.keySet());
		
		System.out.println("After adding all Keys from two hashmaps into HashSet: "+hs);
		
		//To remove all keys of second HashMap
		//hs.removeAll(hm2.keySet());
		
		//To remove all keys of first HashMap
		hs.removeAll(hm1.keySet());
		
		System.out.println(hs);
		
	}

}
