import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {

	
	public static void main(String[] args) {
		
		String pattern  = "([a-z]+)([0-9+])";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher("sam");
		System.out.println(m.matches());
	}
}
