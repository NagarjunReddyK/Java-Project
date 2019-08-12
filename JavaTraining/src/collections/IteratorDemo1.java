package collections;

import java.util.ArrayList;
import java.util.Iterator;
//
public class IteratorDemo1 {
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<Integer>();
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
