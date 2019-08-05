package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Test3");
		v.add("Test4");
		v.add("Test1");
		v.add("Test2");
		
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		System.out.println("Using for loop");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		
		System.out.println("Using for each loop");
		for(String s:v){
			System.out.println(s);
		}
		
		System.out.println("Using Iterator");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("Using ListIterator");
		ListIterator<String> litr=v.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		
	}

}
