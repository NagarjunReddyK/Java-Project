package collectionstest;

import java.util.ArrayList;
import java.util.ListIterator;
//Ex: we can perform add,update,remove operations by using ListIterator
public class ArrayListDemo7 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mohan");
		al.add("Nag");
		al.add("Chaitanya");
		ListIterator<String> lstr=al.listIterator();
		lstr.add("Prasad");
		while(lstr.hasNext()){
			if(lstr.next().equals("Nag"))
				//lstr.set("NagarjunReddy");
				lstr.remove();
		}
		//lstr.remove(); //removes the last element
		for(String str:al)
			System.out.println(str);
	}

}
