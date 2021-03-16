package io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo4 {

	public static void main(String[] args) {
		/*
		 * copy file...
		 */
		Path path = Paths.get("spandan1.txt");
		Path path2 = Paths.get("java//spandan1.txt");

		try {
			Files.copy(path, path2);
			System.out.println("file copied...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
