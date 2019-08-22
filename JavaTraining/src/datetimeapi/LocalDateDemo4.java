package datetimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class LocalDateDemo4 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();

		LocalDate duedate=LocalDate.of(2019, Month.AUGUST, 31);

		Period period=today.until(duedate);
		System.out.println(period); //P09
		//OR
		System.out.println(Period.between(today, duedate));


		System.out.println(today.atStartOfDay());
		System.out.println(today.atTime(11, 30));
		System.out.println(today.atTime(11, 30,55));
		System.out.println(today.atTime(LocalTime.now()));
	}

}
