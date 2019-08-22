package datetimeapi;

import java.time.LocalDate;

public class DateCompare {
	public static boolean compareDates(LocalDate date1, LocalDate date2){
		if(date1.isAfter(date2)){
			System.out.println(date1+" is greater than "+date2);
			return false;
		}
			
		else if(date1.isBefore(date2)){
			System.out.println(date1+" is less than "+date2);
			return false;
		}
		else{
			System.out.println(date1+" and "+date2+" are Equal.");
			return true;
		}
	}
	
	public static boolean compareDates2(LocalDate date1, LocalDate date2){
		return date1.equals(date2);
	}
	
	public static boolean compareDates3(LocalDate date1, LocalDate date2){
		return date1.isEqual(date2);
	}
	
	public static boolean compareDates4(LocalDate date1, LocalDate date2){
		return date1.compareTo(date2)==0;
	}
	
	public static boolean compareDates5(LocalDate date1, LocalDate date2){
		return (!date1.isAfter(date2) && !date1.isBefore(date2));
	}
	
	
	
	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2019, 8, 31);
		boolean isEqual=compareDates(date1,date2);
		System.out.println(isEqual);
		
		System.out.println(compareDates2(date1,date2));
		
		System.out.println(compareDates3(date1,date2));
		
		System.out.println(compareDates4(date1,date2));
		
		System.out.println(compareDates5(date1,date2));
		
	}

}
