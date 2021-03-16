package io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class NIoDemo3 {

	public static void main(String[] args) {

		System.out.println("pls enter fila name to create..");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		Path path = Paths.get(name);
		
		
		boolean flag = Files.exists(path);
		if(flag==true){
			
			System.out.println(name+"..is already exist");
		}
		else{
			
			try {
				Files.createFile(path);
				System.out.println("new file created..");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
