package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Bill> al=new ArrayList<Bill>();
		al.add(new Bill(205,"BN007",100.00));
		al.add(new Bill(201,"BN001",205.00));
		al.add(new Bill(204,"BN006",25.00));
		al.add(new Bill(203,"BN002",130.00));
		al.add(new Bill(202,"BN005",70.00));
		
		//Collections.sort(al, new BillIdComparator());
		//Collections.sort(al, new BillNumberComparator());
		Collections.sort(al, new BillAmountComparator());
		
		for(Bill b:al){
			System.out.println(b.getBillId()+"---"+b.getBillNumber()+"---"+b.getBillAmount());
		}
	}

}
