package collectionstest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args){
		TreeSet<String> nameSet=new TreeSet<String>();
		 System.out.println("nameSet size before adding the names: " + nameSet.size());
			nameSet.add("Nora");
			nameSet.add("Thomas");
			nameSet.add("Lily");
			nameSet.add("Charles");
			nameSet.add("David");
			nameSet.add("Ella");
			System.out.println("nameSet size after adding the names: " + nameSet.size());
			
			System.out.println("Print the names to the standard output");
			for(String name:nameSet)
				System.out.print(name+" ");
			
			System.out.println("");
			System.out.println("Another method to print the names to the standard output");
			Iterator<String> itr=nameSet.iterator();
			while(itr.hasNext())
				System.out.print(itr.next()+" ");
			
	}

}
