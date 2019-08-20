package comparison;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCompare4 {
	public static void main(String[] args) {
		List<ExpTest> list1  = new ArrayList<ExpTest>();
		list1.add(new ExpTest("Ex123"));
		list1.add(new ExpTest("E987123"));
		
		List<ExpTest> list2  = new ArrayList<ExpTest>();
		list2.add(new ExpTest("Ex123"));
		list2.add(new ExpTest("E9871232"));
		
		System.out.println(list1.equals(list2));
		
		Iterator<ExpTest> itr=list1.iterator();
		while(itr.hasNext()){
			ExpTest str=itr.next();
			if(list2.remove(str)){
				itr.remove();
			}
		}
		
		ArrayList<ExpTest> unmatched=new ArrayList<ExpTest>();
		unmatched.addAll(list1);
		unmatched.addAll(list2);
		for(ExpTest e:unmatched){
			System.out.println("Unmatched elements: "+e.expNumber);
		}
	}

}

class ExpTest{
	String expNumber;
	ExpTest(String expNumber){
		this.expNumber=expNumber;
	}
	
	@Override
	public boolean equals(Object obj){
		//typecast obj to ExpTest so that we can compare Expenses 
		ExpTest inv=(ExpTest)obj;
		return this.expNumber.equals(inv.expNumber);
	}
}