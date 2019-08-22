package datetimeapi;

import java.time.LocalDate;

public class LocalDateDemo5 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today.isLeapYear()); //false
		
		
		System.out.println(today.getYear());//2019
		System.out.println(today.getMonthValue()); // 8
		System.out.println(today.getMonth()); //August
		System.out.println(today.getDayOfMonth()); //22
		System.out.println(today.getDayOfWeek()); //THURSDAY
		System.out.println(today.getDayOfYear()); //
		System.out.println(today.getDayOfWeek().equals("SATURDAY"));//false
		System.out.println(today.lengthOfMonth()); //31
		System.out.println(today.lengthOfYear()); //365
		System.out.println(today.toString());//2019-08-21
		
	}

}
