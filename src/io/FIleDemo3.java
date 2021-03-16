package io;

import java.io.File;
import java.util.Scanner;

public class FIleDemo3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter folder name");
		String folder = sc.next();
		//java//j.txt
		System.out.println("pls enter file name to delete::");
		String fname = sc.next();
		//java//j.txt
		//scholl//sttudent.txt
		File file = new File(folder+"//"+fname);
		boolean res = file.delete();
		if(res==true){
			
			System.out.println("file deleted..");
		}
		else{
			
			System.out.println("somrthing went wrong..");
		}
	}
}
