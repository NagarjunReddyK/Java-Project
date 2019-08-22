package datetimeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo3 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		
		
		System.out.println(today.minusDays(3));//
		System.out.println(today.minusMonths(1));//
		System.out.println(today.minusWeeks(2));//
		System.out.println(today.minusYears(1));//
		System.out.println(today.minus(2, ChronoUnit.DAYS));
	
		System.out.println(today.plusDays(5)); //
		System.out.println(today.plusMonths(1));//
		System.out.println(today.plusWeeks(2));//
		System.out.println(today.plusYears(1));//
		System.out.println(today.plus(2, ChronoUnit.DAYS));
	}

}
