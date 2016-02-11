package collectionstest;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Nag");
		al.add("Prasad");
		al.add("Chaitu");
		al.add("Mohan");
		al.add("XTGlobal");
		al.add("Murali");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(str.equals("XTGlobal")){
				itr.remove();
			}
		}
		System.out.println(al);		
	}
}
