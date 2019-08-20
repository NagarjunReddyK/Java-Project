package comparison;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//common method to compare two lists
public class ArrayListCompare {
	public static ArrayList<String> compareLists(List<String> a, List<String> b){
		ArrayList<String> unmatched=new ArrayList<String>();
		// Check for sizes and nulls
		if ((a.size() != b.size()) || (a == null && b!= null) || (a != null && b== null)){
			System.out.println("Lists are NOT equal");
		} 
		Iterator<String> itr=a.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(b.remove(str)){
				itr.remove();
			}
		}
		unmatched.addAll(a);
		unmatched.addAll(b);

		return unmatched;
	}
	
	public static ArrayList<String> equalLists(List<String> a, List<String> b){
		ArrayList<String> unmatched=new ArrayList<String>();
		// Check for sizes and nulls
		if ((a.size() != b.size()) || (a == null && b!= null) || (a != null && b== null)){
			System.out.println("Lists are NOT equal");
		} 
		ListIterator<String> itr=a.listIterator();
		while(itr.hasNext()){
			String str=itr.next();
			if(b.remove(str)){
				itr.remove();
			}
		}
		unmatched.addAll(a);
		unmatched.addAll(b);
		return unmatched;
	}
	public static void main(String[] args){
		List<String> one  = new ArrayList<String>();
		List<String> two  = new ArrayList<String>();

		one.add("username");
		one.add("password");
		one.add("login");

		two.add("login");
		two.add("username");
		two.add("password");
		//two.add("signup");
		
		System.out.println(equalLists(one, two));
	}

}
