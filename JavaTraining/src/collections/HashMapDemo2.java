package collections;

import java.util.HashMap;

//Ex: put() (if the key is already available then old value will be replaced with new value and returns old value)
public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<String,String> hmCountry=new HashMap<String,String>();
		 hmCountry.put("SP","Spain");
	      hmCountry.put("GE","Germany");
	      hmCountry.put("FR","France");
	      System.out.println(hmCountry.put("SP","India"));
	     System.out.println(hmCountry.put("GE","jshfkjh"));
	      System.out.println(hmCountry);
		
	}

}
