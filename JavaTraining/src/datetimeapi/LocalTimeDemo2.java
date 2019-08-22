package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo2 {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();

		//LocalDateTime dateTime = time.atDate(LocalDate.now());
		LocalDateTime dateTime = LocalTime.parse("11:45").atDate(LocalDate.now());
		System.out.println("Converting LocalTime to LocalDateTime: "+dateTime);
		
		LocalTime specificTime=LocalTime.of(12, 45);
		System.out.println("Is current time less than given time?: "+time.isAfter(specificTime));//false
		System.out.println("Is current time greater than given time?: "+time.isBefore(specificTime));//true

		System.out.println(time.compareTo(LocalTime.now()));//-ve
		System.out.println(time.compareTo(LocalTime.parse("11:50:45")));
		System.out.println(time.equals(LocalTime.of(11,58,56,500)));

		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));//Returns time in String format.
		
		System.out.println("Current Hour:"+time.getHour()+", Current Minute:"+time.getMinute()+", Current Second:"+time.getSecond());
		
		
	}

}
