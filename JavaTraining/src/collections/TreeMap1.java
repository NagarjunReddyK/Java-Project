package collections;

import java.util.TreeMap;
//Adding objects to TreeMap
public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("review", "btnReview");
		t.put("approve", "Approve");
		t.put("pay", "Pay");
		t.put("delete", "lnkDelete");
		t.put("reject", "btnReject");
		t.put("cancel", "lnkCancel");
		
		System.out.println(t);
	
	}

}
