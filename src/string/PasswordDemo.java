package string;

import java.util.Scanner;

public class PasswordDemo {

	public static void main(String[] args) {

		String ourpassword = "sam123";
		String ourusername = "samir";
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter userName:-");
		String username = sc.next();
		System.out.println("pls enter password:-");
		String password = sc.next();

		boolean flag = ourpassword.equals(password);
		boolean flag1 = ourusername.equals(username);
		if (flag == true && flag1 == true) {

			System.out.println("login success..");
		} else {

			System.out.println("login failed..");
		}

	}
}
