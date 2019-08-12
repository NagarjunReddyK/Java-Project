package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
//TreeSet with cursors Iterator & Spliterator
public class TreeSetDemo1 {
	public static void main(String[] args){
		Set<String> nameSet=new TreeSet<String>();
		 System.out.println("nameSet size before adding the names: " + nameSet.size());
			nameSet.add("Vendor4");
			nameSet.add("Vendor2");
			nameSet.add("Vendor5");
			nameSet.add("Vendor1");
			nameSet.add("Vendor3");
			System.out.println("nameSet size after adding the names: " + nameSet.size());
			
			/*System.out.println("Print the names using for-each loop:");
			for(String name:nameSet)
				System.out.println(name);*/
			//Collections.sort(nameSet);
			
			System.out.println("Print the names using Iterator:");
			Iterator<String> itr=nameSet.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			
			/*Spliterator<String> spl=nameSet.spliterator();
			spl.forEachRemaining(System.out::println);*/
			
			
			
	}
}
