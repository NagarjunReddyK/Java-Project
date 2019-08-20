package comparison;

import java.util.HashMap;
// To verify whether two HashMaps are equal or not
public class HashMapsCompare1 {
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
		
		
		System.out.println(hm1.equals(hm2));
	}

}
