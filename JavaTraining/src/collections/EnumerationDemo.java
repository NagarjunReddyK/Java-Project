package collections;

import java.util.Enumeration;
import java.util.Vector;
//
public class EnumerationDemo {
	public static void main(String[] args){
		Vector<String> v=new Vector<String>();
		v.add("Vendor5");
		v.add("Vendor2");
		v.add("Vendor4");
		v.add("Vendor1");
		v.add("Vendor3");
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()){
			String str=en.nextElement();
			System.out.println(str);
		}
	}

}
