package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalanderDemo {

	public static void main(String[] args) {

		//create object of calander class
		Calendar c = Calendar.getInstance();
		
		System.out.println("year ::"+c.get(Calendar.YEAR));
		System.out.println("Month ::"+c.get(Calendar.MONTH));
		System.out.println("Week Of Month::"+c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week of Year ::"+c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Date::"+c.get(Calendar.DATE));
		System.out.println("Hour::"+c.get(Calendar.HOUR));
		System.out.println("Minute::"+c.get(Calendar.MINUTE));
		System.out.println("mill seconds::"+c.get(Calendar.MILLISECOND));
		
		
	}
}
