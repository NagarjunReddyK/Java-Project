package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

// Ex: In HashMap, JVM uses equals() to identify duplicate keys(i.e. content comparison. But,
//In IdentityHashMap, JVM uses == operator to identify duplicate keys (i.e., reference comparison))
public class HashMapDemo3 {
	public static void main(String[] args) {
	/*HashMap<Integer, String> hm=new HashMap<Integer, String>();
	Integer i1=new Integer(10);
	Integer i2=new Integer(20);
	hm.put(i1,"Vendor1");
	hm.put(i2,"Vendor2");
	System.out.println(hm);*/
	
	IdentityHashMap<Integer, String> hm=new IdentityHashMap<Integer, String>();
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	hm.put(i1,"Vendor1");
	hm.put(i2,"Vendor2");
	System.out.println(hm);
	
	}
}
