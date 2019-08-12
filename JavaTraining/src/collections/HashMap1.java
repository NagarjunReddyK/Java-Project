package collections;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("SP","Spain");
		hm.put("GE","Germany");
		hm.put("FR","France");
		hm.put("CN","China");
		hm.put("US","United States");
		hm.put("RU","Russia");
		hm.put("GB","United Kingdom ");
		hm.put("IN","India");
		hm.put("BR","Brazil");
		hm.put("SA","South Africa");
		hm.put(null,"India");
		
		System.out.println(hm);
	}
}
