package collections;

import java.util.HashMap;

public class HashMap4 {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("SP","Spain");
		hm.put("GE","Germany");
		hm.put("FR","France");
		hm.put("CN","China");
		hm.put("US","United States");
		hm.put("RU","Russia");
		hm.put("GB","United Kingdom");
		hm.put("IN","India");
		hm.put("BR","Brazil");
		hm.put("SA","South Africa");

		//get the value based on key
		System.out.println(hm.get("IN"));
		System.out.println(hm.getOrDefault("IN", "Not Found"));

		//Remove the value based on key
		String str=hm.remove("CN");
		System.out.println("Removed: "+str);

		//Update the value based on Key
		hm.replace("IN", "Bharath");
		//System.out.println(hm);

		hm.replace("IN", "Bharath", "Indian");

		System.out.println(hm);

		System.out.println(hm.containsKey("SA"));
		System.out.println(hm.containsValue("United States"));

	}

}
