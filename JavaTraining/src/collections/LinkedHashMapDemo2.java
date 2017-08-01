package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo2 {
	public static void main(String[] args) {
		LinkedHashMap<Login,Dashboard> lhm = new LinkedHashMap<Login,Dashboard>();
		lhm.put(new Login("TestUser1","pwd@123"), new Dashboard(111,"bill_123"));
		lhm.put(new Login("TestUser2","pwd@999"), new Dashboard(222,"bill_200"));
		
		Set<Entry<Login, Dashboard>> s=lhm.entrySet();
		//Using Iterator
		Iterator<Entry<Login, Dashboard>> itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry<Login, Dashboard> m = itr.next();
			Login l = m.getKey();
			System.out.println(l.username+"---"+l.password);
			
			Dashboard d = m.getValue();
			System.out.println(d.billId+"---"+d.billNumber);
			
		}
		
		/*//Using for-each loop
		for(Map.Entry<Login, Dashboard> f:s){
			System.out.println(f.getKey().username+"---"+f.getKey().password);
			System.out.println(f.getValue().billId+"---"+f.getValue().billNumber);
		}*/
	}
}

class Login{
	String username,password;
	Login(String username, String password){
		this.username=username;
		this.password=password;
	}
}

class Dashboard{
	int billId;
	String billNumber;
	Dashboard(int billId, String billNumber){
		this.billId=billId;
		this.billNumber=billNumber;
	}
}
