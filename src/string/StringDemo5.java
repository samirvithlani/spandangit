package string;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str1 ="javajava";
		String str2 ="JaVa";
		
		boolean flag = str1.equalsIgnoreCase(str2);
		System.out.println(flag);
		
		int index = str1.indexOf('a');
		int index2 = str1.lastIndexOf('a');
		System.out.println(index);
		System.out.println(index2);
	}
}
