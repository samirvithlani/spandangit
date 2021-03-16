package arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		// <> <--- Type Safe
		/// backend index
		// duplicate elements can be stored..
		ArrayList<String> list = new ArrayList<String>();
		list.add("spandan"); // list[0]
		list.add("jay"); // list[1]
		list.add("raj"); // list[2]
		list.add("parth"); // list[3]
		list.add("neha"); // list[4]
		list.add("spandan"); // list[5]

		/*
		 * for (int i = 0; i < list.size(); i++) {
		 * 
		 * System.out.println(list.get(i)); }
		 */
		// ADVANCE FOR LOOP,FOR EACH LOOP,ENHANCE FOR LOOP

		for (String names : list) {

			System.out.println(names);
		}

		int len = list.size();
		System.out.println(len);

		list.add(0, "samir");

		System.out.println("after add..");
		for (String names : list) {

			System.out.println(names);
		}

	}
}
