package collections;

import java.util.ArrayList;
import java.util.Arrays;

//Ex: Conversion of String array to ArrayList by using asList() method
public class ArrayListDemo9 {
	public static void main(String[] args) {
		String[] str={"Vendor1","Vendor2","Vendor3"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
		al.add("Vendor4");
		al.add("Vendor5");
		//Print the values using for-each loop//
		for(String s:al)
			System.out.println(s);
	}

}
