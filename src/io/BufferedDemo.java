package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {

	
	/***********************************************************/
	
	public static void main(String[] args) {
		
		
		try {
			FileWriter fw = new FileWriter(new File("spandan1.txt"));  
			BufferedWriter writer = new BufferedWriter(fw);
			fw.write("hi this is bufffer...");
			fw.close();
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("spandan1.txt")));
			/*int c;
			while((c =reader.read())!= -1){
				
				System.out.print((char)c);
			}*/
			String data;
			
			while((data = reader.readLine())!= null){
				
				System.out.print(data);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
				
	}
}
