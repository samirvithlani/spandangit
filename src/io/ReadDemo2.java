
package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter file namme..");
		String fname = sc.next();
		File file = new File(fname);
		//fname must be exist and fname must be file not a folder..
		
		if(file.exists()&& file.isFile()){
			
			try {
				FileReader reader = new FileReader(file);
				int c;
				int count=0;
				while((c=reader.read() )  != -1 ){
					
					System.out.print((char)c);
					count++;
				}
				System.out.println();
				System.out.println("count = "+count);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else{
			
			System.out.println("please check file name..");
		}
		
		
		
		
		
	}
}
