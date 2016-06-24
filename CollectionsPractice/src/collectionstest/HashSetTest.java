package collectionstest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args){
		HashSet<String> nameSet=new HashSet<String>();
		 System.out.println("nameSet size before adding the names: " + nameSet.size());
		nameSet.add("Nora");
		nameSet.add("Thomas");
		nameSet.add("Lily");
		nameSet.add("Charles");
		nameSet.add("David");
		nameSet.add("Ella");
		System.out.println("nameSet size after adding the names: " + nameSet.size());
		
		Iterator<String> itr=nameSet.iterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		
		System.out.println("");
		//Another method to print the names to the standard output
		for(String name:nameSet){
			System.out.print(name+" ");
		}
		
	}

}
