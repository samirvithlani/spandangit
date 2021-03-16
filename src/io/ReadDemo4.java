package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDemo4 {

	public static void main(String[] args) {

		// whe u pass system.in scanner class param it will not throw ant
		// exception
		// Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\Shaun Pant\\Desktop\\dictonry");
		// when u pass file object in scamner class param it will throw an
		// excpetion
		try {
			Scanner sc = new Scanner(file);
			/// hasnext method will check is there any word left or not>>
			// if not any word hasnext method will return false..or else return
			/// true
			/// hello spadan

			int count = 0;
			while (sc.hasNext()) {

				System.out.println(sc.next());
				count++;

			}
			System.out.println(":total word in file-" + count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
