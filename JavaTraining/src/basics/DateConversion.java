package basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
	public static String convertTime(String _24HourTime) throws ParseException{
        SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
        SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm a");
        Date _24HourDt = _24HourSDF.parse(_24HourTime);
        String _24hrsTime=_12HourSDF.format(_24HourDt);
        System.out.println(_24hrsTime);
        return _24hrsTime;
	}
	
	public static void main(String[] args) throws ParseException {
		convertTime("20:00:00.0000000");
	}

}
