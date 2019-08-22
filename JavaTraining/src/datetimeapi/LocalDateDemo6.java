package datetimeapi;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateDemo6 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println("System date is: "+today);
		
		LocalDate firstDayOfMonth =today.with(TemporalAdjusters.firstDayOfMonth());//2019-08-01
		System.out.println("First date of this month= "+firstDayOfMonth);
		
		LocalDate lastDayOfMonth =today.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last date of this month= "+lastDayOfMonth);//2019-08-31
		
		System.out.println("First date of Next month= "+today.with(TemporalAdjusters.firstDayOfNextMonth())); //2019-09-01
		
		LocalDate firstDayOfYear = today.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("First date of this year= "+firstDayOfYear);//2019-01-01
		
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= "+lastDayOfYear);//2019-12-31
		
		System.out.println(today.with(TemporalAdjusters.next(today.getDayOfWeek()))); // next monday date if today is monday
		System.out.println(today.with(TemporalAdjusters.nextOrSame(today.getDayOfWeek())));// current date
		System.out.println(today.with(TemporalAdjusters.previous(today.getDayOfWeek()))); //previous monday date if today is monday
		System.out.println(today.with(TemporalAdjusters.previousOrSame(today.getDayOfWeek())));//current date
		System.out.println(today.with(TemporalAdjusters.firstInMonth(today.getDayOfWeek())));//first monday date in this month if today is monday
		System.out.println(today.with(TemporalAdjusters.lastInMonth(today.getDayOfWeek())));//last monday date in this month if today is monday
	
		System.out.println(today.withDayOfMonth(30));//given date in current month
		System.out.println(today.withMonth(9));//Returns the date of given month, current date & year (ex: 2019-09-22) if current date is 22
		
	}

}
