package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo1 {
	public static void main(String[] args) {
		List<String> al =new ArrayList<String>();
		al.add("Vendor4");
		al.add("Vendor2");
		al.add("Vendor1");
		
		Spliterator<String> spl=al.spliterator();
		
		// Traversing elements
		spl.forEachRemaining(System.out::println);
	}

}
