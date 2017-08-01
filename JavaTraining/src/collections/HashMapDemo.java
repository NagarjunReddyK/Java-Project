package collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> hmCountry=new HashMap<String,String>();
		 hmCountry.put("SP","Spain");
	      hmCountry.put("GE","Germany");
	      hmCountry.put("FR","France");
	      hmCountry.put("CN","China");
	      hmCountry.put("US","United States");
	      hmCountry.put("RU","Russia");
	      hmCountry.put("GB","United Kingdom ");
	      hmCountry.put("IN","India");
	      hmCountry.put("BR","Brazil");
	      hmCountry.put("SA","South Africa");
	      hmCountry.put(null,"India");
	      System.out.println(hmCountry);
	}

}
