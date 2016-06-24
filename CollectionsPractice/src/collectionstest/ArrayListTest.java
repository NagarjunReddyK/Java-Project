package collectionstest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args){
		ArrayList<String> nameList=new ArrayList<String>();
		//System.out.println("nameList size before adding the names: " + nameList.size());
		nameList.add("Emily");
		nameList.add("Willian");
		nameList.add("Sofia");
		nameList.add("Lucas");
		nameList.add("Emma");
		nameList.add("Jack");
		System.out.println("nameList size after adding the names: " + nameList.size());
		
		// Add the name "John" between the names "Sofia" and "Lucas"
		nameList.add(3, "John");
		
		 // Remove Emma from the list
		nameList.remove(4);
		
		// Sort the names in alphabetical order.
		Collections.sort(nameList);
		
		System.out.println("Print the names to the standard output");
		for(int i=0;i<nameList.size();i++){
			System.out.print(nameList.get(i)+" ");
		}
		 System.out.println("");
		 System.out.println("Another method to print the names to the standard output");
		 Iterator<String> iter=nameList.iterator();
		 while(iter.hasNext()){
			 System.out.print(iter.next()+" ");
		 }
		 System.out.println("");
		 
		// Check whether nameList contains Ben and Emma 
		 boolean foundNag=nameList.contains("Nag");
		 System.out.println("Does nameList contains Nag? --> "+foundNag);
		 boolean foundEmma=nameList.contains("Emma");
		 System.out.println("Does nameList contains Emma? --> "+foundEmma);
		
		 // find the element in the second index position 
		 System.out.println(nameList.get(2));
	}	
	

}
