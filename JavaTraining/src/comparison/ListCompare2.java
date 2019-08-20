package comparison;

import java.util.ArrayList;
import java.util.List;

public class ListCompare2 {
	public static void main(String[] args) {
		List<String> list1  = new ArrayList<String>();
		List<String> list2  = new ArrayList<String>();

		list1.add("username");
		list1.add("password");
		list1.add("login");
		list1.add("login");

		list2.add("login");
		list2.add("username");
		list2.add("password");
		list2.add("password");

		//if the size of two lists 
		if(list1.size() == list2.size()){
			List<String> list3  = new ArrayList<String>(list1);
			list3.removeAll(list2);

			List<String> list4  = new ArrayList<String>(list2);
			list4.removeAll(list1);


			ArrayList<String> list5=new ArrayList<>(list3);
			list5.addAll(list4);

			System.out.println("Unmatched Elements from both Lists: "+list5);
		}
		else
			System.out.println("Size of Two Lists is NOT Equal...");
	}

}
