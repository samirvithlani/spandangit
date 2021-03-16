package lambda;

interface Match {

	// public abstract String matching()
	String matching(String str);
}

public class Demo5 {

	public static void main(String[] args) {

		Match m = (str) -> {

			return str.toUpperCase();
		};
		System.out.println(m.matching("jay"));

	}
}
