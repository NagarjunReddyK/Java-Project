package collections;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap4 {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("review", "btnReview");
		tm.put("approve", "Approve");
		tm.put("pay", "Pay");
		tm.put("delete", "lnkDelete");
		tm.put("reject", "btnReject");
		tm.put("cancel", "lnkCancel");

		TreeMap<String,String> tm2=new TreeMap<String,String>();
		tm2.putAll(tm);
		tm2.put("restore", "btnRestore");

		//Printing all the Keys
		System.out.println("----- All the Keys-----");
		Set<String> s=tm2.keySet();
		for(String str:s)
			System.out.println(str);

		//Printing all the values
		System.out.println("----- All the Values-----");
		Collection<String> v=tm2.values();
		for(String st:v)
			System.out.println(st);

		//Printing all the Entries
		System.out.println("----- All the Entries-----");
		Set<Entry<String,String>> entries=tm2.entrySet();
		for(Entry<String,String> entry:entries)
			System.out.println(entry);


	}

}
