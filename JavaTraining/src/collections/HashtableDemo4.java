package collections;

import java.util.Hashtable;

public class HashtableDemo4 {
	public static void main(String[] args) {
		 Hashtable<String, String> ht1 = new Hashtable<>();
		 ht1.put("review", "btnReview");
		 ht1.put("approve", "Approve");
		 ht1.put("pay", "Pay");
		 ht1.put("delete", "lnkDelete");
		
		 //To Copy one Hashtable objects into another Hashtable
		 Hashtable<String, String> ht2 = new Hashtable<>(ht1);
		 //ht2.putAll(ht1);
		 ht2.put("reject", "btnReject");
		 ht2.put("cancel", "lnkCancel");
		 
		 System.out.println(ht2);
	}

}
