package datetimeapi;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDemo {
	public static void main(String[] args) {
		//MONTH
				for(Month c:Month.values())
					System.out.println(c);
				System.out.println(Month.valueOf("JANUARY").maxLength());//31
				System.out.println(Month.of(8));//AUGUST
				System.out.println(Month.valueOf("AUGUST").getValue());//8
				System.out.println(Month.of(9).getDisplayName(TextStyle.FULL, Locale.US));//September
	}

}
