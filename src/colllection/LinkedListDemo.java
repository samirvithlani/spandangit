package colllection;

import java.util.LinkedList;

public class LinkedListDemo {

	
	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<>();
		ls.add("raj");
		ls.add(0, "samir");
		ls.addFirst("parth");
		ls.addLast("priya");
		ls.add("jay");
		ls.add("raj");
		
		
		//System.out.println("removed element ="+ls.remove());
		//System.out.println("removed elem"+ls.remove(0));
		//System.out.println(ls.removeLastOccurrence("raj"));
		
		//System.out.println(ls.indexOf("samirr"));
		//first == peek
		
		//System.out.println("peek"+ls.peek());
		//it will remove first element
		//System.out.println("pop"+ls.pop());
		
		
		
		//ls.clear();
		
		
		
		
		
		for(String s : ls) {
			
			System.out.println(s);
		}
		
	}
}
