package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressComparisonDemo {
	public static void main(String[] args) {
		ArrayList<Address> al=new ArrayList<Address>();
		al.add(new Address("zajesh","sel","raj@gmail.com","201,abc colony"));
		al.add(new Address("zajesh","rao","abhi@yahoo.com","104,test nagar"));
		al.add(new Address("Jacob","rob","jacob@hotmail.com","14,financial dist"));
		al.add(new Address("NMichelle","Kait","mich@gmail.com","nanakramguda"));
		al.add(new Address("SKaitly","Lam","kait@gmail.com","hitech city"));
		
		//To sort based on email in ascending order
		Collections.sort(al,Comparator.comparing(Address::getEmail));
		
		//To sort based on email in reverse order
		//Collections.sort(al,Comparator.comparing(Address::getEmail).reversed());
	
		
		//To sort mulitple objects based on FirstName, Email
		//Collections.sort(al,Comparator.comparing(Address::getFirstName).thenComparing(Address::getEmail));
		
		for(Address a:al){
			System.out.println(a.firstName+"--"+a.lastName+"--"+a.email+"--"+a.address);
		}
	}

}
