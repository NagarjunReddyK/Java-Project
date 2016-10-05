package collectionstest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Ex: different ways to retrieve data
public class ArrayListDemo6 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("element1");
	    al.add("element2");
	    al.add("element3");
	    al.add("element4");
	    al.add("element5");
	    //1st approach to retrieve data from ArrayList
	    System.out.println("--- using for-each loop ---");
	    for(String str:al)
	    	System.out.println(str);
	    
	    //2nd approach to retrieve data from ArrayList
	    System.out.println("--- using for loop ---");
	    for(int i=0;i<al.size();i++)
	    	System.out.println(al.get(i));
	    
	    //3rd approach to retrieve data from ArrayList
	    //using Iterator
	    System.out.println("--- using Iterator ---");
	    Iterator<String> itr=al.iterator();
	    while(itr.hasNext())
	    	System.out.println(itr.next());
	    
	    //using ListIterator
	    System.out.println("--- using ListIterator ---");
	    ListIterator<String> litr=al.listIterator();
	    while(litr.hasNext())
	    	System.out.println(litr.next());
	    
	}

}
