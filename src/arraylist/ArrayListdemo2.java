package arraylist;

import java.util.ArrayList;

public class ArrayListdemo2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("jay");
		al.add("jiya");
		al.add("raj");
		al.add("parth");

		
		int index = al.indexOf("parth");
		System.out.println("index = "+index);
		
		for (String s : al) {

			System.out.println(s);
		}

		al.remove(1);

		System.out.println("after remove..");

		for (String s : al) {

			System.out.println(s);
		}

		al.clear();
		System.out.println("after clear array list =");

		for (String s : al) {

			System.out.println(s);
		}
		
		
		 
		
		

	}
}
