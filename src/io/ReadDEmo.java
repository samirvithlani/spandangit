package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDEmo {

	public static void main(String[] args) {
		
		/**READ DATA FROM FILE*/
		
		
		//already exist file...
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter .txt file name to read data");
		String fname= sc.next();
		File file = new File(fname);
		//validate if file is exist or not???
		if(file.exists() && file.isFile()){
			//if fnmae is exist or fname is file  true...
			try {
				FileReader reader = new FileReader(file);
				int c;
				while((c = reader.read())!= -1){
					
					System.out.print((char)c);
				}
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
