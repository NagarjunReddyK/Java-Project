package sorting;

import java.util.Comparator;

public class BillNumberComparator implements Comparator<Bill>{

	public int compare(Bill o1, Bill o2) {
		return o1.billNumber.compareTo(o2.billNumber);
	}

}
