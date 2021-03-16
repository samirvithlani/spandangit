package string;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		System.out.println("pls enter name :-");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		char str[] = name.toCharArray();
		int len = str.length;
		int index = 0;
		int j, i;

		//s //p //a //n //d
		for (i = 0; i < len; i++) {

			for (j = 0; j < i; j++) {

				if (str[i] == str[j]) {

					break;
				}
			}

			if (j == i) {

				str[index++] = str[i]; //spand 
			}

		}

		System.out.println(String.valueOf(Arrays.copyOf(str, index)));

	}
}
