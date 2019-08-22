package datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//common methods
public class DateConversion2 {
	public static LocalDate convertStringToDate(String date){
		return LocalDate.parse(date,DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	}
	
	public static String convertDateToString(LocalDate date){
		return DateTimeFormatter.ofPattern("MM/dd/yyyy").format(date);
	}
	
	
	
	public static void main(String[] args) {
		LocalDate date=convertStringToDate("08/22/2019");
		System.out.println(date);
		
		String date2=convertDateToString(date);
		System.out.println(date2);
		
	}

}
