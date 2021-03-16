package colllection;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	
	public static void main(String[] args) {
		
		//interface
		//tree set
		//hash set
		Set<String> set  = new TreeSet<String>();
		set.add("zarin");
		set.add("salman");
		set.add("dhoni");
		set.add("virat");
		set.add("akshar");
		
		
		for(String s:set){
			
			System.out.println(s);
		}
		
		
		
		
	}
}
