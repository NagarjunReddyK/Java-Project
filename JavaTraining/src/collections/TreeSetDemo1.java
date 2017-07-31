package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args){
		TreeSet<String> nameSet=new TreeSet<String>();
		 System.out.println("nameSet size before adding the names: " + nameSet.size());
			nameSet.add("Vendor4");
			nameSet.add("Vendor2");
			nameSet.add("Vendor5");
			nameSet.add("Vendor1");
			nameSet.add("Vendor3");
			System.out.println("nameSet size after adding the names: " + nameSet.size());
			
			
			System.out.println("Print the names using for-each loop");
			for(String name:nameSet)
				System.out.print(name+" ");
			
			
			System.out.println("");
			System.out.println("Print the names using Iterator");
			Iterator<String> itr=nameSet.iterator();
			while(itr.hasNext())
				System.out.print(itr.next()+" ");
			
	}
}
