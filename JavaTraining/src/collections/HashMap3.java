package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

// Ex: In HashMap, JVM uses equals() to identify duplicate keys(i.e. content comparison. But,
//In IdentityHashMap, JVM uses == operator to identify duplicate keys (i.e., reference comparison))//
public class HashMap3 {
	public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	hm.put(i1,"Vendor1");
	hm.put(i2,"Vendor2");
	System.out.println(hm);
	
	IdentityHashMap<Integer, String> hm1=new IdentityHashMap<Integer, String>();
	hm1.put(i1,"Vendor1");
	hm1.put(i2,"Vendor1");
	System.out.println(hm1);
	
	}
}
