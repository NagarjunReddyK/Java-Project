package datetimeapi;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo3 {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		
		System.out.println(time.minusHours(1));
		System.out.println(time.minusMinutes(30));
		System.out.println(time.minusSeconds(60));
		System.out.println(time.minus(2,ChronoUnit.HOURS));
		
		System.out.println(time.plusHours(1));
		System.out.println(time.plusMinutes(30));
		System.out.println(time.plusSeconds(60));
		System.out.println(time.plus(2,ChronoUnit.HOURS));
		
		System.out.println(time.until(LocalTime.of(12, 00), ChronoUnit.MINUTES));
		System.out.println(ChronoUnit.MINUTES.between(time, LocalTime.of(12, 00)));
		
		System.out.println(time.withHour(18));//Returns a copy of this LocalTime with the hour-of-day altered.
		System.out.println(time.withMinute(55));//Returns a copy of this LocalTime with the minute-of-hour altered.
		
	/*	System.out.println(LocalTime.MIDNIGHT);//00:00
		System.out.println(LocalTime.MIN);//00:00
		System.out.println(LocalTime.MAX);//23:59:59.999999999
*/		
		System.out.println(time.toString());

		
	}

}
