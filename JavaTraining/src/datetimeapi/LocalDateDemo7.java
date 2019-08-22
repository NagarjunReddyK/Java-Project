package datetimeapi;

import java.time.LocalDate;

public class LocalDateDemo7 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		if(today.getDayOfWeek().equals("SATURDAY") || today.getDayOfWeek().equals("SUNDAY")){
			System.out.println("Today is a Weekend...");
		}
		else
			System.out.println("Today is a Working Day.");
	}

}
