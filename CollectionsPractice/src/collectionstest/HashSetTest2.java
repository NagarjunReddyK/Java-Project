package collectionstest;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {
	public static void main(String args[]){
	      Set<String> group1,group2,bothGroups;
	      group1 = new HashSet<String>();
	      group2 = new HashSet<String>();
	 
	      group1.add("Olivia");
	      group1.add("Mia");
	      group1.add("Alexander");
	      group1.add("Mason");
	      group1.add("James");
	 
	      group2.add("Joseph");
	      group2.add("Mia");
	      group2.add("Mila");
	      group2.add("Olivia");
	      group2.add("James");
	      group2.add("Charlotte");
	      
	      bothGroups=new HashSet<String>(group1);
	      bothGroups.addAll(group2);
	      System.out.print("Group1: "+group1);
	      System.out.println("");
	      System.out.print("Group2: "+group2);
	      System.out.println("");
	      System.out.print("Both Groups: "+bothGroups);
	}

}
