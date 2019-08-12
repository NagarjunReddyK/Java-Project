package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class SpliteratorDemo2 {
	public static void main(String[] args) {
		Set<String> al =new HashSet<String>();
		al.add("Vendor4");
		al.add("Vendor2");
		al.add("Vendor1");
		
		Spliterator<String> spl=al.spliterator();
		
		// Traversing elements
		spl.forEachRemaining(System.out::println);
	}

}
