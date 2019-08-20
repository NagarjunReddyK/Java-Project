package comparison;

import java.util.HashMap;
import java.util.Map;
//User-defined class object as value
public class HashMapsCompare6 {
	public static void main(String[] args) {
		Map<String, Expense> m1 = new HashMap<String, Expense>();
		m1.put("EXP01", new Expense("exp12056"));
		m1.put("EXP02", new Expense("E981017"));
		
		Map<String, Expense> m2 = new HashMap<String, Expense>();
		m2.put("EXP01", new Expense("exp12056"));
		m2.put("EXP02", new Expense("E981017"));
		
		System.out.println("Are entry sets equal? "+m1.entrySet().equals(m2.entrySet()));
		
	}
}

class Expense{
	String expNumber;
	Expense(String expNumber){
		this.expNumber=expNumber;
	}
	
	@Override
	public boolean equals(Object obj){
		//typecast obj to Expense so that we can compare Expenses 
		Expense exp=(Expense)obj;
		return this.expNumber.equals(exp.expNumber);
	}
}
