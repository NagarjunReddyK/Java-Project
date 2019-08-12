package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
//Ex: HashSet with Cursors Iterator & Spliterator
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Vendor1");
		h.add("Vendor2");
		h.add("Vendor3");
		h.add("Vendor4");
		h.add("Vendor5");
		h.add(null);
		h.add(null);
		/*//creation of Iterator Object
		Iterator<String> itr = h.iterator();
		while (itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
		}*/
		
		/*Spliterator<String> spl=h.spliterator();
		spl.forEachRemaining(System.out::println);*/
		
		
		HashSet<Integer> al=new HashSet<Integer>();
		for(int i=1;i<=10;i++){
			al.add(i);
		}
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()){
			Integer in=itr.next();
			if(!(in%2==0)){
				itr.remove();
			}
		}
		
		System.out.println(al);
	}
}
