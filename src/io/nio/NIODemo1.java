package io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * NON-BLOCKING IO
 * */
public class NIODemo1 {

	public static void main(String[] args) {

		/// path interface
		// paths class get instance
		Path path = Paths.get("niodemo.txt");
		// create file..
		try {
			// create file is static method of Files class (Path interface
			// object)
			Files.createFile(path);
			System.out.println("file is created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
