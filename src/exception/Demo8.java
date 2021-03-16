package exception;

public class Demo8 {

	void demo() throws ArithmeticException {

		int a = 10;
		int ans = a / 0;
		System.out.println(ans);

	}

	public static void main(String[] args) {

		Demo8 d = new Demo8();
		try {
			d.demo();
		} catch (ArithmeticException e) {

			System.out.println("can not divide by zero");
		}
	}
}
