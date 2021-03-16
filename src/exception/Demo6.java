package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo6 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			Scanner sc1 = new Scanner(new File("abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
