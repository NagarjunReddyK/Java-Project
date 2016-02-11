package collectionstest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseString {
	public static void main(String[] args){
		String input="Nagarjun Reddy";
		char[] arr=input.toCharArray();
		ArrayList<Character> charList=new ArrayList<>();
		for(char c:arr)
		charList.add(c);
		Collections.reverse(charList);
		ListIterator<Character> li=charList.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		} 
	}
}
