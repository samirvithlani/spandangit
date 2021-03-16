package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDemo2 {

	public static void main(String[] args) {

		File file = new File("spandan1.txt");
		Scanner sc = new Scanner(System.in);
		try {
			file.createNewFile();
			System.out.println("enter name::");
			String name = sc.next();
			System.out.println("enter email::");
			String email = sc.next();
			System.out.println("enter salary::");
			float sal = sc.nextFloat();

			FileWriter fw = new FileWriter(file);
			fw.write("user name = " + name);
			fw.write("\nuser email = " + email);
			fw.write("\nuser salary = " + sal);
			fw.close();
			System.out.println("done...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
