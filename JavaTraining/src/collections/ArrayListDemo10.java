package collections;

import java.util.ArrayList;
import java.util.List;

//Ex:Conversion of ArrayList to String array by using toArray method
public class ArrayListDemo10 {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Vendor1");
		al.add("Vendor5");
		al.add("Vendor3");
		al.add("Vendor2");
		String[] a = new String[al.size()];
		al.toArray(a);
		//Print the values using for-each loop//
		for(String s:al)
			System.out.println(s);
	}

}
