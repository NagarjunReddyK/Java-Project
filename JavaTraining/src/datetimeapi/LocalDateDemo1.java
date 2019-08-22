package datetimeapi;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo1 {
	public static void main(String[] args) {
		
		//static methods of LocalDate class
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(2019, 8, 31));//2019-08-31
		System.out.println(LocalDate.of(2019, Month.AUGUST, 31));//2019-08-31
		System.out.println("215th day of Year-2019: "+LocalDate.ofYearDay(2019, 215)); //2019-08-02
		System.out.println(LocalDate.parse("2019-08-01")); //2019-08-01
		
		LocalDate today=LocalDate.now();
		System.out.println(today.atStartOfDay());
		
		System.out.println(today.atTime(11,15));
		

	}

}
