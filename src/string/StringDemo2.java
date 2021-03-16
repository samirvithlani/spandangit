package string;

public class StringDemo2 {

	
	public static void main(String[] args) {
		
		
		String name ="    samir    ";
		System.out.println(name);
		int len = name.length();
		System.out.println("length of string = "+len);
		//trim method will remove white space from string and ending.. of string..
		name = name.trim();
		System.out.println(name);
		len = name.length();
		System.out.println("length of string = "+len);
		
		
		
		
	}
}
