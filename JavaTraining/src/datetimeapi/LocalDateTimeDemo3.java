package datetimeapi;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo3 {
	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		
		LocalDateTime specifiedDateTime=LocalDateTime.of(2019, 8, 15, 12, 30);
		//isAfter(), isBefore(), isEqual()
		System.out.println(dateTime.isAfter(specifiedDateTime));
		System.out.println(dateTime.isBefore(specifiedDateTime));
		System.out.println(dateTime.isEqual(specifiedDateTime));
		
		/*System.out.println(dateTime.minusHours(2));
		System.out.println(dateTime.minusMinutes(40));
		System.out.println(dateTime.minusSeconds(50));
		System.out.println(dateTime.minusDays(10));
		System.out.println(dateTime.minusWeeks(2));
		System.out.println(dateTime.minusMonths(1));
		System.out.println(dateTime.minusYears(1));
		System.out.println(dateTime.minus(2,ChronoUnit.DAYS));*/
		
		
		/*System.out.println(dateTime.plusHours(2));
		System.out.println(dateTime.plusMinutes(40));
		System.out.println(dateTime.plusSeconds(50));
		System.out.println(dateTime.plusDays(10));
		System.out.println(dateTime.plusWeeks(2));
		System.out.println(dateTime.plusMonths(1));
		System.out.println(dateTime.plusYears(1));
		System.out.println(dateTime.plus(2,ChronoUnit.DAYS));*/
		
		System.out.println(dateTime.toLocalDate());
		System.out.println(dateTime.toLocalTime());
		System.out.println(dateTime.toString());
		
		
	}

}
