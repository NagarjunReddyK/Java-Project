package collections;

import java.util.Hashtable;

public class HashtableDemo1 {
	public static void main(String[] args) {
		 Hashtable<String, String> ht = new Hashtable<>();
		 ht.put("review", "btnReview");
		 ht.put("approve", "Approve");
		 ht.put("pay", "Pay");
		 ht.put("delete", "lnkDelete");
		 ht.put("reject", "btnReject");
		 ht.put("cancel", "lnkCancel");
		 
		 System.out.println(ht);
	}

}
