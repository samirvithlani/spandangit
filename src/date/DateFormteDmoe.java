package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormteDmoe {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-YYYY hh:mm:ss a EEEE");
		String dt = format.format(date);
		System.out.println(dt);
		
	}
}
