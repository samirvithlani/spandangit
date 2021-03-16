package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		try {
			System.out.println("pls enter age..");
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			age = age /0;
			System.out.println(age);
		} catch (InputMismatchException e) {

			System.out.println("enter digits only..");
		}
		catch (ArithmeticException e) {
			
			System.out.println("can not divide by zero");
		}
	}
}
