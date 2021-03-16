package io;

import java.io.File;
import java.util.Scanner;

public class FIleDemo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter parent folder name");
		String pfolder = sc.next();
		File file = new File(pfolder);
		file.mkdir();
		// parent folder creatation
		System.out.println("enter child folder name :");
		String cfolder = sc.next();
		//royal\\abc;
		File file2 = new File(pfolder + "\\" + cfolder);
		boolean res2 = file2.mkdir();
		if(res2==true){
			
			System.out.println("folder created..");
		}

	}
}
