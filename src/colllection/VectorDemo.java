package colllection;

import java.util.Vector;

public class VectorDemo {

	// vector is an child class of list interface...
	public static void main(String[] args) {

		// class
		Vector<String> v = new Vector<>();
		v.add("spandan"); // at the end of vector
		v.add(0, "raj");// specific index
		v.addElement("jay");
		v.add("parth");
		v.add("abcd");
		
		
		//v.remove(0); ///index
		//v.remove("jay");
		v.removeElementAt(0);
		System.out.println(v.firstElement());
		
		System.out.println(v.isEmpty());

		for (String s : v) {

			System.out.println(s);
		}

	}
}
