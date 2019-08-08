package sorting;

import java.util.Comparator;

public class BillIdComparator implements Comparator<Bill> {
	public int compare(Bill b1, Bill b2) {
		return b1.billId - b2.billId;
	}

}
