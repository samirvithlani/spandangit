package lambda;

interface say {

	public abstract void saying();
}

public class Demo1 implements say {

	public static void main(String[] args) {

		say s = new Demo1();
		s.saying();
	}

	public void saying() {

		System.out.println("saying");

	}
}
