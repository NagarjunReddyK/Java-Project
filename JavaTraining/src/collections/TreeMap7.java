package collections;

import java.util.TreeMap;

public class TreeMap7 {
	public static void main(String[] args) {
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.put("review", "btnReview");
		tm.put("approve", "Approve");
		tm.put("pay", "Pay");
		tm.put("delete", "lnkDelete");
		tm.put("reject", "btnReject");
		tm.put("cancel", "lnkCancel");
		
		if(tm.containsKey("delete")){
			System.out.println("Specified key is present.");
			tm.remove("delete");
		}
		
		if(tm.containsValue("btnReject")){
			System.out.println("Specified value is present.");
			tm.remove("reject");
		}
		System.out.println(tm);
	}

}
