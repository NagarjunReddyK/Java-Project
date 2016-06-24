package collectionstest;

import java.util.ArrayList;

public class ArrayListQuiz {
	public static void main(String[] args){
	      ArrayList<String> prLanguage = new ArrayList<String>();
	      prLanguage.add("Java");
	      prLanguage.add("C++");
	      prLanguage.add("Python");
	      prLanguage.add("PHP");
	      prLanguage.add("Ruby");
	      prLanguage.add("Perl");
	 
	      prLanguage.add(3,null);
	      prLanguage.add(3,null);
	      prLanguage.add(4,"PHP");
	 
	      for(int i = 0; i < prLanguage.size(); i ++ ) {
	         System.out.print(" " + prLanguage.get(i));
	      }
	   }
}
