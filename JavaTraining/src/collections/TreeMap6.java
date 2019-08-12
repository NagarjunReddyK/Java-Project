package collections;

import java.util.Map;
import java.util.TreeMap;
//
public class TreeMap6 {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("review", "btnReview");
		tm.put("approve", "Approve");
		tm.put("pay", "Pay");
		tm.put("delete", "lnkDelete");
		tm.put("reject", "btnReject");
		tm.put("cancel", "lnkCancel");
		
		System.out.println(tm);
		Map.Entry<String, String> m1=tm.pollFirstEntry();
		System.out.println(m1.getKey()+"---"+m1.getValue());
		
		Map.Entry<String, String> m2=tm.pollLastEntry();
		System.out.println(m2.getKey()+"---"+m2.getValue());
		
		System.out.println(tm);
		
	}

}
