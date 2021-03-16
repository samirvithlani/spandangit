package string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * naman ->palindrome name... madam malayalam
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter your name :-");
		String name = sc.next(); // jay
		String tempname = name; // tempname = jay
		StringBuffer sb = new StringBuffer(tempname); // jay
		sb.reverse(); // yaj

		boolean flag = name.equals(sb.toString()); // true ,false
		System.out.println(flag);
		if (flag == true) {

			System.out.println("this name is palindrome name..");
		} else {
			System.out.println("this name is not palindrome name...");

		}

	}
}
