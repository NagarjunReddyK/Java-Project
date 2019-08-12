package collections;

import java.util.TreeMap;
//Copying one TreeMap objects into another TreeMap
public class TreeMap3 {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("review", "btnReview");
		tm.put("approve", "Approve");
		tm.put("pay", "Pay");
		tm.put("delete", "lnkDelete");
		tm.put("reject", "btnReject");
		tm.put("cancel", "lnkCancel");
		
		TreeMap<String,String> tm2=new TreeMap<String,String>(tm);
		//tm2.putAll(tm);
		tm2.put("restore", "btnRestore");
		
		System.out.println(tm2);
		
		if(tm2.containsKey("pay"))
			System.out.println("Specified key is present.");
		if(tm2.containsValue("Approve"))
			System.out.println("Specified value is present.");
		
		//tm2.clear();
		//System.out.println(tm2);
		
	}
}
