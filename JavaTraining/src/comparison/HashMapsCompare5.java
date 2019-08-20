package comparison;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.google.common.collect.MapDifference;
import com.google.common.collect.MapDifference.ValueDifference;
import com.google.common.collect.Maps;

public class HashMapsCompare5 {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("username", "nag@xtg.com");
		m1.put("password", "Test@12312");

		Map<String, String> m2 = new HashMap<String, String>();
		m2.put("username", "nag@xtg.com");
		m2.put("password", "Test@1231");

		 //To compare entries of two maps
	    System.out.println(areEqual(m1,m2));

	    //To compare values of two maps having same keys
	    Map<String, Boolean> result=areEqualKeyValues(m1,m2);
	    System.out.println(result);

	   /* //To obtain common keys that have different values in each HashMap
	    MapDifference<String, String> diff = Maps.difference(m1, m2);
	    Map<String, ValueDifference<String>> entriesDiffering = diff.entriesDiffering();
	    System.out.println(entriesDiffering);*/

		//To get common entries using MapDifference.entriesInCommon():
		/*MapDifference<String, String> df = Maps.difference(m1, m2);
		Map<String, String> entriesInCommon = df.entriesInCommon();
		System.out.println(entriesInCommon);*/
		
		//To remove the common entries from both HashMaps
		/*Set<Entry<String, String>> set= entriesInCommon.entrySet();
		for(Entry<String, String> st:set){
			m1.entrySet().remove(st);
			m2.entrySet().remove(st);
		}
		if(m1.size()>0 || m2.size()>0){
			System.out.println("Two hashmaps are NOT equal...");
			System.out.println("Unmatched data from first HashMap: "+m1);
			System.out.println("Unmatched data from second HashMap: "+m2);
		}
		else{
			System.out.println("Two hashmaps are equal...");
		}*/
		



	}

	//To compare HashMaps using the Java 8 Stream API:
	private static boolean areEqual(Map<String, String> first, Map<String, String> second) {
		if (first.size() != second.size()) {
			return false;
		}
		return first.entrySet().stream().allMatch(e -> e.getValue().equals(second.get(e.getKey())));
	}

	//To compare values of two maps having same keys
	private static Map<String, Boolean> areEqualKeyValues(Map<String, String> first, Map<String, String> second) {
		return first.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().equals(second.get(e.getKey()))));
	}

}
