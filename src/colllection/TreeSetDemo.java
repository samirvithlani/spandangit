package colllection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();

		ts.add("spandan");
		ts.add("raj");
		ts.add("parth");
		ts.add("neha");
		ts.add("dhiraj");
		
		
		String firstdata = ts.first();
		System.out.println(firstdata);
		

		/// System.out.println(ts.remove("raj"));
		// if spandan is avaialable on treee set it will return true..
		// System.out.println(ts.contains("spandana"));
		// String high = ts.lower("spandan");
		// System.out.println("-"+high);

		
		ts.pollFirst();
		ts.pollLast();
		System.out.println("last eleme"+ts.last());
		System.out.println("first "+ts.first());
		
		

		for (String s : ts) {

			System.out.println(s);
		}

	}
}
