package datetimeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDemo2 {
	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		
		//compareTo
		System.out.println(dateTime.compareTo(LocalDateTime.of(2019,8,30,12,30)));
		System.out.println(dateTime.compareTo(LocalDateTime.now(ZoneId.of("Asia/Calcutta"))));
		System.out.println(dateTime.compareTo(LocalDateTime.of(2019,8,20,12,30)));
		
		//equals
		System.out.println(dateTime.equals(LocalDateTime.of(2019,8,30,12,30)));//false
		System.out.println(dateTime.equals(LocalDateTime.now(ZoneId.of("Asia/Calcutta"))));//true
		
		//format 
		String format=dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(format);
		
		//getDayOfMonth() getDayOfYear() getDayOfWeek()
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getDayOfYear());
		System.out.println(dateTime.getDayOfWeek());
		
		//getHour(), getMinute(), getSecond()
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getSecond());
		
		//getMonthValue(), getMonth(), getYear()
		System.out.println(dateTime.getMonthValue());
		System.out.println(dateTime.getMonth());
		System.out.println(dateTime.getYear());
		
		
		
	}

}
