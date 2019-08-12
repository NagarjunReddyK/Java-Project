package collections;

import java.util.Hashtable;

public class HashtableDemo2 {
	public static void main(String[] args) {
		 Hashtable<String, String> ht = new Hashtable<>();
		 ht.put("review", "btnReview");
		 ht.put("approve", "Approve");
		 ht.put("pay", "Pay");
		 ht.put("delete", "lnkDelete");
		 ht.put("reject", "btnReject");
		 ht.put("cancel", "lnkCancel");
		 
		 //remove method
		/* System.out.println(ht.remove("pay"));
		 System.out.println(ht.remove("reject1","btnReject"));*/
		 
		 //get(), getOrDefault() methods
		 /*System.out.println(ht.get("review"));
		 System.out.println(ht.getOrDefault("cancel1", "Key Not Found"));*/
		 
		 
		 //contains(), containsKey(), containsValue()
		 System.out.println(ht.contains("btnReview"));
		 System.out.println(ht.containsKey("cancel"));
		 System.out.println(ht.containsValue("btnReview"));
		 
		 //putIfAbsent()
		 System.out.println(ht.putIfAbsent("cancel", "linkCancel"));
		 
		 System.out.println(ht);
		 
	}

}
