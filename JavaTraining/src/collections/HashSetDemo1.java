package collections;

import java.util.HashSet;
//
public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Vendor1");
		hs.add("Vendor2");
		System.out.println(hs.add("Vendor2"));//false
		System.out.println(hs.add("Vendor4"));//true
		hs.add("Vendor3");
		System.out.println(hs);
	}
}
