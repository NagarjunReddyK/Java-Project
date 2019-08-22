package datetimeapi;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo2 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		//instance methods
		LocalDate duedate=LocalDate.of(2019, Month.AUGUST, 31);
		
		System.out.println(today.isAfter(duedate)); //false
		System.out.println(today.isBefore(duedate)); //true

		System.out.println(today.isEqual(duedate)); //false
		System.out.println(today.equals(duedate)); //false

		int days=today.compareTo(duedate);
		System.out.println(days);
		
		if(days < 0)
			System.out.println(today+" is less than "+duedate);
		else if(days>0)
			System.out.println(today+" is greater than "+duedate);
		else
			System.out.println(today+"is Equal to "+duedate);
		
		
		
		
	}

}
