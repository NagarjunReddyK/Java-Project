package comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCompare1 {
	public static void main(String[] args) {
		List<String> one  = new ArrayList<String>();
		List<String> two  = new ArrayList<String>();

		one.add("login");
		one.add("username");
		one.add("password");

		two.add("password");
		two.add("username");
		two.add("login");

		Collections.sort(one);
		Collections.sort(two);
		
		boolean isEqual=one.equals(two);
		System.out.println("Are Two Lists Equal?: "+isEqual);
	}

}
