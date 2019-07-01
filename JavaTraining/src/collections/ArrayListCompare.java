package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCompare {
	public static List<String> equalLists(List<String> a, List<String> b){
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		list1.addAll(a);
		list2.addAll(b);
		List<String> unmatched=new ArrayList<String>();
	    // Check for sizes and nulls
	  /*  if ((a.size() != b.size()) || (a == null && b!= null) || (a != null && b== null)){
	       // return false;
	    	System.out.println("NOT equal");
	    } */


	    // Sort and compare the two lists          
	  // Collections.sort(a);
	   //Collections.sort(b); 
	    Iterator<String> itr=list1.iterator();
	    while(itr.hasNext()){
	    	String str=itr.next();
	    	if(list2.remove(str)){
	    		itr.remove();
	    		continue;
	    	}
	    }
	    unmatched.addAll(list1);
	    unmatched.addAll(list2);
	   // return a.equals(b);
	    return unmatched;
	}
	public static void main(String[] args){
		 List<String> one  = new ArrayList<String>();
	     List<String> two  = new ArrayList<String>();

	        one.add("one");
	        one.add("two");
	        one.add("six");

	        two.add("six");
	        two.add("two");
	        two.add("one");
	        System.out.println(equalLists(one, two));
	}

}
