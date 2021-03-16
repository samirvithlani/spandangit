package string;

import java.util.Scanner;

public class StringBufferDemo3 {

	public static void main(String[] args) {

		System.out.println("pls enter string...");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(str);
		System.out.println("pls enter char to remove..");
		String c = sc.next();

		str = c.replace(c, "*");
		System.out.println(str);

	}
}
