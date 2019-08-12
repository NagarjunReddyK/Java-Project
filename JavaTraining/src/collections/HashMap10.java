package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMap10 {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("US","United States");
		hm.put("RU","Russia");
		hm.put("GB","United Kingdom ");
		hm.put("IN","India");

		/*//Sorting in ascending order based on key in Java 8
		System.out.println("Sorting in ascending order based on key");
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);*/

		/*//Sorting in descending order based on key in Java 8
		System.out.println("Sorting in descending order based on key");
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);*/

		/*//Sorting in ascending order based on value in Java 8
		System.out.println("Sorting in ascending order based on value");
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);*/

		//Sorting in descending order based on value in Java 8
		System.out.println("Sorting in descending order based on value");
		hm.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);


	}

}
