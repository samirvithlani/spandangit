package string;

import java.util.Scanner;

public class CoutSpace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a string..");
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println("pls enter cahr to search..");
		String ch = sc.next();
		// spaandan
		// ch.caray(0)

		char c = ch.charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("total cha in string = " + count);
	}
}
