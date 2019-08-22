package datetimeapi;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class LocalTimeDemo1 {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println("Current Time="+time);
		
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Calcutta"));
		System.out.println("Current Time in IST="+timeKolkata);
		
		LocalTime hrsMins=LocalTime.of(14,30);
		System.out.println("Specific Time with Hrs & Mins of Day="+hrsMins);
		
		LocalTime hrsMinsSec=LocalTime.of(14,30,45);
		System.out.println("Specific Time with Hrs, Mins & Seconds of Day="+hrsMinsSec);
		
		LocalTime specificTime=LocalTime.of(14, 00, 01, 01);
		System.out.println("Specific Time of Day="+specificTime);
		
		LocalTime tm=LocalTime.ofSecondOfDay(10000);
		System.out.println("Time for the given seconds: "+tm);
		
		LocalTime tmParse=LocalTime.parse("17:30:45");
		System.out.println("LocalTime after parsing String: "+tmParse);
		
		//To get all Timezones
		String[] ar=TimeZone.getAvailableIDs();
		System.out.println(ar.length);
		for(int i=0;i<ar.length;i++){
			System.out.println(ar[i]);
		}
	}

}
