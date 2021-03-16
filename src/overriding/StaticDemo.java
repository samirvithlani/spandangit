package overriding;

public class StaticDemo {

	int a;
	static int b;

	void add() {

		System.out.println("add method called...");
	}

	static void sub() {
		System.out.println("sub method call");
	}

	public static void main(String[] args) {

		// System.out.println(a);
		System.out.println(b);
		StaticDemo s = new StaticDemo();
		s.add();
		
		StaticDemo.sub();
		
		
	}
}
