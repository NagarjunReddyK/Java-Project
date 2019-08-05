package collections;

import java.util.ArrayList;
import java.util.Vector;
//
public class VectorDemo1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Test1");
		al.add("Test2");
		
		Vector<String> v = new Vector<String>(al);
		v.add("Test3");
		v.add("Test4");
		//System.out.println(v);
		
		ArrayList<String> al2 = new ArrayList<String>(v);
		al2.add("Vendor1");
		al2.add("Vendor2");
		System.out.println(al2);
	}

}
