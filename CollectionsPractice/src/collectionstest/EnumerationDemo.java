package collectionstest;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args){
		Vector<String> v=new Vector<String>();
		v.add("Nag");
		v.add("Prasad");
		v.add("Chaitu");
		v.add("Mohan");
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()){
			String str=en.nextElement();
			System.out.println(str);
		}
	}
}
