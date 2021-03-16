package exception;

import java.util.Scanner;

public class Demo4 {

	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		try{
		for(int i=0;i<5;i++){
			
			System.out.println(a[i]);
			
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("pls check array size..");
		}
		
	}
}
