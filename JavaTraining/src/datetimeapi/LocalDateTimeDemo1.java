package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo1 {
	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Current Date & Time is: "+dateTime);
		
		System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
		
		System.out.println(LocalDateTime.of(2019,07,30,12,30));
		System.out.println(LocalDateTime.of(2019,07,30,12,30,55));
		System.out.println(LocalDateTime.of(2019,07,30,12,30,55,500));
		
		System.out.println(LocalDateTime.of(2019,Month.AUGUST,30,12,30));
		System.out.println(LocalDateTime.of(2019,Month.AUGUST,30,12,30,54));
		
		System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
		
		LocalDateTime dt=LocalDateTime.parse("2019-07-30T16:17:16.244");
		System.out.println("Parsed Date & Time is: "+dt);
		
		LocalDateTime parse2=LocalDateTime.parse("2019-07-30T16:17:16.244",DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(parse2);
		

		
	}
	

}
