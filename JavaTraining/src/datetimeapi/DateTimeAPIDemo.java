package datetimeapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class DateTimeAPIDemo {
	public static void main(String[] args) throws ParseException{
		LocalDate today=LocalDate.now();
	  /*System.out.println(today); //2016-08-01
		System.out.println(today.getYear());//2016
		System.out.println(today.getMonthValue()); // 8
		System.out.println(today.getMonth()); //August
		System.out.println(today.getDayOfMonth()); //1
		System.out.println(today.getDayOfWeek()); //MONDAY
		System.out.println(today.getDayOfYear()); //214
		System.out.println(today.getDayOfWeek().equals("SATURDAY"));//false
		LocalDate duedate=LocalDate.of(2016, Month.JULY, 30);
		System.out.println(today.isAfter(duedate)); //true
		System.out.println(today.isBefore(duedate)); //false
		System.out.println(today.isEqual(duedate)); //false
		System.out.println(today.equals(duedate)); //false
		System.out.println(today.isLeapYear()); //true
		System.out.println(today.lengthOfMonth()); //31
		System.out.println(today.lengthOfYear()); //366
		System.out.println(today.minusDays(3));//2016-07-29
		System.out.println(today.minusMonths(1));//2016-07-01
		System.out.println(today.minusWeeks(2));//2016-07-18
		System.out.println(today.minusYears(1));//2015-08-01
		System.out.println(today.plusDays(5)); //2016-08-06
		System.out.println(today.plusMonths(1));//2016-09-01
		System.out.println(today.plusWeeks(2));//2016-08-15
		System.out.println(today.plusYears(1));//2017-08-01
		System.out.println(LocalDate.ofEpochDay(730));//1972-01-01
		System.out.println("214th day of Year-2016: "+LocalDate.ofYearDay(2016, 214)); //2016-08-01
		System.out.println(LocalDate.parse("2016-08-01")); //2016-08-01
		Period period=today.until(duedate);
		System.out.println(period); //P-2D 		
		System.out.println(today.atTime(LocalTime.now()));
		System.out.println("First date of this month= "+today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= "+lastDayOfYear);*/
		
		/*System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));//2016-08-01
		System.out.println(today.with(TemporalAdjusters.next(today.getDayOfWeek()))); //2016-08-08
		System.out.println(today.with(TemporalAdjusters.nextOrSame(today.getDayOfWeek())));//2016-08-01
		System.out.println(today.with(TemporalAdjusters.previous(today.getDayOfWeek()))); //2016-07-25
		System.out.println(today.with(TemporalAdjusters.previousOrSame(today.getDayOfWeek())));//2016-08-01
		System.out.println(today.with(TemporalAdjusters.lastDayOfMonth()));//2016-08-31
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));//2016-08-01
		System.out.println(today.with(TemporalAdjusters.firstInMonth(today.getDayOfWeek())));//2016-08-01 
*/		
		LocalTime time=LocalTime.now();
		System.out.println("Current Time="+time);
		
		LocalTime specificTime=LocalTime.of(14, 00, 01, 01);
		System.out.println("Specific Time of Day="+specificTime);
		
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST="+timeKolkata);
		
		LocalTime tm=LocalTime.ofSecondOfDay(10000);
		System.out.println(tm);
		
		System.out.println("Current Hour:"+time.getHour()+", Current Minute:"+time.getMinute()+", Current Second:"+time.getSecond());
		
		System.out.println(time.isBefore(specificTime));
		System.out.println(time.isAfter(specificTime));
		System.out.println(time.equals(specificTime));
		
		System.out.println(time.minusHours(1));
		System.out.println(time.minusMinutes(30));
		System.out.println(time.minusSeconds(60));
		
		System.out.println(time.plusHours(1));
		System.out.println(time.plusMinutes(30));
		System.out.println(time.plusSeconds(60));

		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		String str="14:45:30";
		System.out.println(LocalTime.parse(str));
		
		
		//MONTH
		for(Month c:Month.values())
			System.out.println(c);
		System.out.println(Month.valueOf("JANUARY").maxLength());//31
		System.out.println(Month.of(8));//AUGUST
		System.out.println(Month.valueOf("AUGUST").getValue());//8
		System.out.println(Month.of(9).getDisplayName(TextStyle.FULL, Locale.US));//September
		
		if(!today.getDayOfWeek().equals("SATURDAY") && !today.getDayOfWeek().equals("SUNDAY")){
			System.out.println("Today is Working day...");
		}
		else
			System.out.println("Today is a Weekend.");
	  
	  /*LocalDate date1 = LocalDate.now();
	  String text = date1.format(DateTimeFormatter.ISO_LOCAL_DATE);
	  LocalDate parsedDate = LocalDate.parse(text, DateTimeFormatter.ISO_LOCAL_DATE);
	  System.out.println(text);
	  System.out.println(parsedDate);*/
	 String processDate= new DateTimeAPIDemo().convertDate("08/11/2016");
	 System.out.println("Date After Converting:"+processDate);
	 
	/*// LocalDate to LocalDateTime
	 LocalDateTime dateTime = LocalDate.parse("2019-08-13").atTime(LocalTime.parse("06:30"));
	 // LocalTime to LocalDateTime
	 LocalDateTime dateTime = LocalTime.parse("11:30").atDate(LocalDate.parse("2019-08-13"));
	 // LocalDateTime to LocalDate/LocalTime
	 LocalDate date = LocalDateTime.parse("2019-08-13T06:30").toLocalDate();
	 LocalTime time = LocalDateTime.parse("2019-08-13T06:30").toLocalTime();*/
	 
	}
	public String convertDate(String date) throws ParseException{
		DateFormat userDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat dateFormatNeeded = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = userDateFormat.parse(date);
		String convertedDate = dateFormatNeeded.format(dt);
		return convertedDate;
	}

}
