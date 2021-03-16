package date;

import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		
		//date class object..
		Date date = new Date();
		//printing date class object..
		System.out.println(date);
		System.out.println(date.getDate());
		//time method returns milli seconds
		//milli secnod statrts from 1970 1 january
		System.out.println(date.getTime());
		
		long millseconds = System.currentTimeMillis();
		System.out.println(millseconds);
		
		Date date2 = new Date(millseconds);
		System.out.println(date2);
		
		
	}
}
