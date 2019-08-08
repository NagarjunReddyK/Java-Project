package sorting;

import java.util.Comparator;

public class BillAmountComparator implements Comparator<Bill>{
	public int compare(Bill o1, Bill o2) {
		
		return (int) (o1.billAmount-o2.billAmount);
	}

}
