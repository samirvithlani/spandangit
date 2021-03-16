package date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {
		
		//create instance /object of timezone
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println(timeZone.getDisplayName());
		System.out.println(timeZone.getID());
		System.out.println(timeZone.getDefault());
		System.out.println(timeZone.toZoneId());
		
		String[] zones = timeZone.getAvailableIDs();
		/*for(int i=0;i<zones.length;i++){
			
			System.out.println(zones[i]);
		}*/
		
		//asia/caulcata  --< india
		TimeZone timeZone2 = TimeZone.getTimeZone("America/New_York");
		
		
		Calendar c1 = Calendar.getInstance(timeZone);
		c1.setTimeZone(timeZone2);
		System.out.println(c1.getTime());
		
		
		
		
		
		
		
		
		
		
	}
}
