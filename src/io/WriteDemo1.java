package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo1 {

	public static void main(String[] args) {

		// FileWriter
		try {
			File file = new File("spandan.txt");
			file.createNewFile();

			FileWriter fw = new FileWriter(file);
			fw.write("hi my name is spandan..");
			fw.write("\nmy hobbies are dancing,reading");
			fw.close();
			System.out.println("success....");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
