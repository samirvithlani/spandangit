package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveByname {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("jay");
		al.add("jiya");
		al.add("raj");
		al.add("parth");

		System.out.println("pls enter name TO DELETE :-");

		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		int index = al.indexOf(name); // -1
		if (index != -1) {

			al.remove(index);
			System.out.println(name+":: removed from list successfully");
			System.out.println("new Array list :::");
			for(String s:al){
				
				System.out.println(s);
			}

		} else {

			System.out.println(name + ":: is not in list");
		}

	}
}
