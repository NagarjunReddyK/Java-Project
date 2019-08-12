package collections;

import java.util.HashMap;

public class HashMap9 {
	public static void main(String[] args) {
		HashMap<String,Search1> hm = new HashMap<String,Search1>();
		hm.put("firstSearch", new Search1());
		
		Search1 obj=hm.get("firstSearch");
		obj.display();
	}

}

class Search1{
	void display(){
		System.out.println("display method in Search1 class");
	}
}