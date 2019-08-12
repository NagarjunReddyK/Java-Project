package collections;

import java.util.ArrayList;
import java.util.Collections;

//Ex: To sort ArrayList in ascending/descending order 
public class ArrayListDemo8 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("element5");
	    al.add("element2");
	    al.add("element4");
	    al.add("element1");
	    al.add("element3");
	   System.out.println("ArrayList data before sorting:");
	   for(String str:al)
		   System.out.println(str);
	 
	 /*  //Sorting ArrayList in ascending order//
	   Collections.sort(al);
	   System.out.println("ArrayList data after sorting:");
	   for(String str:al)
		   System.out.println(str);*/
	 /*  
	 //Sorting ArrayList in decending order
	   //approach-1
	   Collections.sort(al,Collections.reverseOrder());
	   System.out.println("ArrayList data after sorting in descending order:");
	   for(String str:al)
		   System.out.println(str);*/
	   
	   //approach-2
	   System.out.println("using reverse method");
	   Collections.reverse(al);
	   for(String str:al)
		   System.out.println(str);
	}

}
