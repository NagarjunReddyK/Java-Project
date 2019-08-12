package collections;

import java.util.HashMap;

//Ex: put() (if the key is already available then old value will be replaced with new value and returns old value)
public class HashMap2 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("SP","Spain");
		hm.put("GE","Germany");
		hm.put("FR","France");
		//hm.put("SP","Spaintest");
		
		System.out.println(hm.put("SP1","Spaintest"));
		System.out.println(hm.put("GE1","Germanytest"));
		
		System.out.println(hm.putIfAbsent("FR", "India"));
		
		
		System.out.println(hm);

	}

}
