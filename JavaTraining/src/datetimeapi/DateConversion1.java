package datetimeapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateConversion1 {
	public static void main(String[] args) throws ParseException {
		LocalDate localDate = LocalDate.now();
		String pattern="MM/dd/yyyy";
		DateTimeFormatter defaultFormatter = DateTimeFormatter.ofPattern(pattern);
		System.out.println(defaultFormatter.format(localDate));
		
		//Converting local date 2019-08-22 to string 08/22/2019 (optimized statement of above code)
		System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy").format(LocalDate.now()));
		
		String sdate=localDate.toString();
		System.out.println("Using toString method: "+sdate);
		
		//Converting string date from "MM/dd/yyyy" format to LocalDate "yyyy-MM-dd" format 
		String str = "07/30/2019";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(str, formatter);
		System.out.println(date);
		
		//Converting string date from "MM/dd/yyyy" format to "yyyy-MM-dd" format (optimized statement of above code)
		System.out.println(LocalDate.parse("08/22/2019",DateTimeFormatter.ofPattern("MM/dd/yyyy")));
		
		
		// Old process(Java <=1.7): Converting string date from "MM/dd/yyyy" format to "yyyy-MM-dd" format 
		DateFormat userDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		DateFormat dateFormatNeeded = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = userDateFormat.parse("07/30/2019");
		String convertedDate = dateFormatNeeded.format(dt);
		System.out.println("Date conversion from MM/dd/yyyy format to yyyy-MM-dd: "+convertedDate);
		
		//new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("MM/dd/yyyy").parse(date)); //optimized statement of above code
	  
	}
}
