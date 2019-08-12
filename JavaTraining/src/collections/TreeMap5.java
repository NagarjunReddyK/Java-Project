package collections;

import java.util.Map;
import java.util.TreeMap;
//TreeMap methods
public class TreeMap5 {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("review", "btnReview");
		tm.put("approve", "Approve");
		tm.put("pay", "Pay");
		tm.put("delete", "lnkDelete");
		tm.put("reject", "btnReject");
		tm.put("cancel", "lnkCancel");
		
		System.out.println(tm);
		
		/*Map<String, String> m=tm.subMap("delete", "reject");
		System.out.println(m);
		
		Map<String, String> hm=tm.headMap("delete");
		System.out.println(hm);
		Map<String, String> tl=tm.tailMap("delete");
		System.out.println(tl);*/
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.lowerKey("pay"));
		System.out.println(tm.higherKey("pay"));
	}

}
