package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//HashMap with String key and Search object as value
public class HashMap8 {
	public static void main(String[] args) {
		HashMap<String,Search> hm = new HashMap<String,Search>();
		hm.put("firstSearch", new Search(111,"bill_123"));
		hm.put("secondSearch", new Search(222,"bill_200"));
		
		Set<Entry<String, Search>> s=hm.entrySet();
		//Using Iterator
		Iterator<Entry<String, Search>> itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry<String, Search> m = itr.next();
			System.out.println("Key: "+m.getKey());
			
			Search d = m.getValue();
			System.out.println(d.billId+"---"+d.billNumber);
			//d.display();
			
		}
		
		//Using for-each loop
		/*for(Map.Entry<String, Search> f:s){
			System.out.println(f.getKey());
			System.out.println(f.getValue().billId+"---"+f.getValue().billNumber);
		}*/
	}

}
class Search{
	int billId;
	String billNumber;
	Search(int billId, String billNumber){
		this.billId=billId;
		this.billNumber=billNumber;
	}
	void display(){
		System.out.println("display method in Search class");
	}
}
