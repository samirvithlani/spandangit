package io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FIleDemo1 {

	public static void main(String[] args) {

		// file object
		System.out.println("pls enter file name to create ::");
		Scanner sc = new Scanner(System.in);
		String fname = sc.next();
		System.out.println("pls enter folder name to create ::");
		String foldernName = sc.next();
		//File file = new File("abc.txt");
		File file = new File(fname);
		File file2 = new File(foldernName);
		// create new file
		try {
			file.createNewFile();
			System.out.println(fname+"- new file is created..");
			
			//to create folder...
			file2.mkdir();
			System.out.println(foldernName+"- new folde is created..");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
