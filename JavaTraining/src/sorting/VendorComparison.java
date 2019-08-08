package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class VendorComparison {
	public static void main(String[] args) {
		ArrayList<Vendor> al=new ArrayList<Vendor>();
		al.add(new Vendor(105,"Cal Telephone"));
		al.add(new Vendor(102,"Movie Ad"));
		al.add(new Vendor(104,"Circulus"));
		al.add(new Vendor(101,"Zee tech"));
		al.add(new Vendor(103,"Verizon"));
		
		Collections.sort(al);
		
		for(Vendor v:al){
			System.out.println(v.vendorId+"---"+v.vendorName);
		}
		
		
		
		
	}

}
