package string;

public class StringBufferDemo2 {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("java");
		System.out.println(name.charAt(1));

		// 0 1 2
		// name.replace(0, 3, "*");
		//name.deleteCharAt(1);
		
		//name.insert(1, "#");
		int len = name.length();
		System.out.println("len = "+len);

		System.out.println("after raplace -> " + name);

	}
}
