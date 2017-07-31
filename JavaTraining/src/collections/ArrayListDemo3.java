package collections;

import java.util.ArrayList;

//Ex: To Add one/more array lists into new ArrayList
public class ArrayListDemo3 {
	public static void main(String[] args) {
		//First ArrayList
        ArrayList<String> arraylist1=new ArrayList<String>();
        arraylist1.add("India");
        arraylist1.add("USA");
        arraylist1.add("England");

        //Second ArrayList
        ArrayList<String> arraylist2=new ArrayList<String>();
        arraylist2.add("South Africa");
        arraylist2.add("Russia");
        arraylist2.add("China");

        //Adding two array lists into new ArrayList
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);
        
        System.out.println(al);

	}

}
