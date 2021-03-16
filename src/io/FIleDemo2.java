package io;

import java.io.File;
import java.util.Scanner;

public class FIleDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("pls enter folder name to create...");
		String foldername = sc.next();
		File file = new File(foldername);
		boolean res = file.mkdir();
		if(res==true){
			
			System.out.println("folder created..");
		}
		else{
			System.out.println("folder not created..");
		}
		
	}
}
