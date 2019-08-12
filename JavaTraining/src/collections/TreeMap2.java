package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

// Retrieving objects from TreeMap
public class TreeMap2 {
	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("review", "btnReview");
		t.put("approve", "Approve");
		t.put("pay", "Pay");
		t.put("delete", "lnkDelete");
		t.put("reject", "btnReject");
		t.put("cancel", "lnkCancel");
		
		 Set<Entry<String, String>> set= t.entrySet();
	      Iterator<Entry<String, String>> itr=set.iterator();
	      while(itr.hasNext()){
	    	  Map.Entry<String, String> ent= itr.next();
	    	  System.out.println("Key: "+ent.getKey()+", Value: "+ent.getValue());
	      }
		
		/*for(Map.Entry<String, String> m:t.entrySet()){
			System.out.println(m.getKey()+"---"+m.getValue());
			}*/
	}

}
