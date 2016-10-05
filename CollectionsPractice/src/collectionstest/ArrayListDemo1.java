package collectionstest;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		//Normal version
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Nag");
		al.add('K');
		System.out.println(al);
		for(Object o:al){
			if(o instanceof Integer)
				System.out.println(o.toString());
			if(o instanceof String)
				System.out.println(o);
			if(o instanceof Character)
				System.out.println(o.toString());
		}
	}

}
