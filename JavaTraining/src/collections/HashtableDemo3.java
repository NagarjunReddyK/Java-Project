package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
//Cursors
public class HashtableDemo3 {
	public static void main(String[] args) {
		 Hashtable<String, String> ht = new Hashtable<>();
		 ht.put("review", "btnReview");
		 ht.put("approve", "Approve");
		 ht.put("pay", "Pay");
		 ht.put("delete", "lnkDelete");
		 ht.put("reject", "btnReject");
		 ht.put("cancel", "lnkCancel");
		 
		/*//To retrieve the keys from Hashtable
		 System.out.println("Keys in Hashtable: "+ht.keySet());
		 
		//Using Enumeration cursor
		 System.out.println("Keys in Hashtable using Enumeration:");
		 Enumeration<String> keys=ht.keys();
		 while(keys.hasMoreElements()){
			 System.out.println(keys.nextElement());
		 }*/
		 
		/*//To retrieve the values from Hashtable
		 System.out.println("Values in Hashtable: "+ht.values());
		 
		 //Using Enumeration cursor
		 System.out.println("Values in Hashtable using Enumeration:");
		 Enumeration<String> el=ht.elements();
		 while(el.hasMoreElements()){
			 System.out.println(el.nextElement());
		 }*/
		 
		/* //Traversing Using Iterator
		 System.out.println("Using Iterator cursor");
		 Set<Entry<String, String>> set=ht.entrySet();
		 Iterator<Entry<String, String>> itr=set.iterator();
		 while(itr.hasNext()){
			 Entry<String, String> ent=itr.next();
			 System.out.println(ent.getKey()+"---"+ent.getValue());
		 }*/
		 
		/*//Using Enumeration cursor
		 System.out.println("Using Enumeration cursor");
		 Enumeration<String> k=ht.keys();
		 String key;
		 while(k.hasMoreElements()){
			 key=k.nextElement();
			 System.out.println(key+"---"+ht.get(key));
		 }*/
		 
		 Set<Entry<String, String>> set=ht.entrySet();
		 System.out.println("Using for each loop");
		 for(Entry<String, String> s:set){
			 System.out.println(s.getKey()+"---"+s.getValue());			 
		 }
		 
	}

}
