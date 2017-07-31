package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Nag");
		al.add("Prasad");
		al.add("Chaitu");
		al.add("Mohan");
		al.add("XTGlobal");
		al.add("Murali");
		ListIterator<String> litr=al.listIterator();
		while(litr.hasNext()){
			String data=litr.next();
			if(data.equals("XTGlobal")){
				//litr.set("XTGLOBAL");
				//litr.add("Xenosoft");
				litr.remove();
			}
		}
		System.out.println(al);
	}

}
