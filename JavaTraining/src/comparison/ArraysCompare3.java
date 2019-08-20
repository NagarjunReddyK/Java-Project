package comparison;

import java.util.Arrays;
//user-defined class object array comparison
public class ArraysCompare3 {
	public static void main(String[] args) {
		
		Invoice[] arr1={new Invoice(101,"Inv_0123"),new Invoice(102,"Inv_1785"),new Invoice(103,"B169530")};
		Invoice[] arr2={new Invoice(101,"Inv_0123"),new Invoice(102,"Inv_1785"),new Invoice(103,"B169530")};
		Invoice[] arr3={new Invoice(101,"Inv_4526"),new Invoice(102,"Inv_96515"),new Invoice(103,"In43789")};
		
		System.out.println(Arrays.equals(arr1,arr2));//true
		System.out.println(Arrays.equals(arr1,arr3));//false
	}

}


class Invoice{
	int invoiceId;
	String invoiceNumber;
	Invoice(int invoiceId, String invoiceNumber){
		this.invoiceId=invoiceId;
		this.invoiceNumber=invoiceNumber;
	}
	
	@Override
	public boolean equals(Object obj){
		//typecast obj to Invoice so that we can compare Invoices 
		Invoice inv=(Invoice)obj;
		return this.invoiceId==inv.invoiceId && this.invoiceNumber.equals(inv.invoiceNumber);
	}
	
}
