package collectionstest;

import java.util.ArrayList;
import java.util.List;
//Ex: To get a sublist from an existing ArrayList
public class ArrayListDemo4 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
	     //Addition of elements in ArrayList
	    al.add("element1");
	    al.add("element2");
	    al.add("element3");
	    al.add("element4");
	    al.add("element5");
	    al.add("element6");

	    System.out.println("Original ArrayList Content: "+al);

	    //Sublist to ArrayList
	    ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
	    System.out.println("SubList stored in ArrayList: "+al2);

	    //Sublist to List
	    List<String> list = al.subList(1, 4);
	    System.out.println("SubList stored in List: "+list);
	}

}
