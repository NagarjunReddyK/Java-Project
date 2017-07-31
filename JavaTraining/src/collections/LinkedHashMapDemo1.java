package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapDemo1 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> hmCountry=new LinkedHashMap<String, String>();
		System.out.println("HashMap size before adding countries: " + hmCountry.size());
		// adding elements to the HashMap
	      hmCountry.put("SP","Spain");
	      hmCountry.put("GE","Germany");
	      hmCountry.put("FR","France");
	      hmCountry.put("CN","China");
	      hmCountry.put("US","United States");
	      hmCountry.put("RU","Russia");
	      hmCountry.put("GB","United Kingdom ");
	      hmCountry.put("IN","India");
	      hmCountry.put("BR","Brazil");
	      hmCountry.put("SA","South Africa");
	      hmCountry.put(null,"India");
	      System.out.println("HashMap size after adding countries: " + hmCountry.size());
	      
	      System.out.println(hmCountry);
	      
	   //display the HashMap content using Iterator
	      Set<Entry<String, String>> set=hmCountry.entrySet();
	      Iterator<Entry<String, String>> itr=set.iterator();
	      while(itr.hasNext()){
	    	  Map.Entry<String, String> ent=(Map.Entry<String,String>) itr.next();
	    	  System.out.print("Key: "+ent.getKey()+", Value: "+ent.getValue());
	    	  System.out.println("");
	    	  
	      }
	     // display using for each loop
	      System.out.println("---- Using for each loop----");
	      for(Map.Entry<String, String> m:hmCountry.entrySet()){
	    	  System.out.print("Key: "+m.getKey()+", Value: "+m.getValue());
	    	  System.out.println("");
	      }
	      
	      // To display all values
	      Collection<String> c=hmCountry.values();
	      for(String str:c)
	    	  System.out.println(str);
	}

}
