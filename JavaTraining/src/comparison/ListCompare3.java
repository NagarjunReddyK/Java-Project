package comparison;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCompare3 {
	public static void main(String[] args) {
		List<String> list1  = new ArrayList<String>();
		List<String> list2  = new ArrayList<String>();

		list1.add("username");
		list1.add("password");
		list1.add("login");
		list1.add("password");

		list2.add("login");
		list2.add("username");
		list2.add("password");
		
		
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(list2.remove(str)){
				itr.remove();
			}
		}
		
		ArrayList<String> unmatched=new ArrayList<String>();
		unmatched.addAll(list1);
		unmatched.addAll(list2);
		
		System.out.println("Unmatched elements: "+unmatched);
		
		
		
	}

}
