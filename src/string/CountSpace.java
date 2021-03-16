package string;

import java.util.Scanner;

public class CountSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a string..");
		String str = sc.nextLine();
		System.out.println(str);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total char in string = " + count);

	}
}
