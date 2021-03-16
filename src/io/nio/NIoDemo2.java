package io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIoDemo2 {

	
	public static void main(String[] args) {
		
		Path path = Paths.get("result");
		try {
			Files.createDirectory(path);
			System.out.println("folder created..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
