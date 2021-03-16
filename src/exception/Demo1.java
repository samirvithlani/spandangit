package exception;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		try{
		System.out.println("pls enter no");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		int ans = 10 /no ;

		System.out.println(ans);
		}catch (Exception e) {
			
			System.out.println("can not Devide By Zero"); 
			
			
		}

	}

}
