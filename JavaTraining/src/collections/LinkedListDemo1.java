package collections;

import java.util.LinkedList;
//
public class LinkedListDemo1 {
	public static void main(String[] args){
		LinkedList<String> l=new LinkedList<String>();
		l.add("Vendor5");
		l.add("Vendor2");
		l.add("Vendor4");
		l.add("Vendor1");
		l.addLast("Vendor3"); //it adds object at last position
		l.addFirst("A"); //it adds object at first position
		l.add(1,"A1"); //add the Object at specified index
		System.out.println("original content:-"+l);
		l.removeFirst(); //removes first Object
		l.removeLast(); //removes last t Object
		System.out.println("after deletion first & last: "+l);
		l.remove("Vendor42"); //remove specified Object
		System.out.println(l.remove("Vendor42"));
		l.remove(2); //remove the object of specified index
		System.out.println("after deletion : "+l);//
		String val = l.get(0); //get method used to get the element
		l.set(2,val+"changed"); //set method used to replacement
		System.out.println("after setting:-"+l);
	}
}
