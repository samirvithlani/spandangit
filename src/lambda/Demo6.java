package lambda;

interface Scan {

	boolean scanning(String flag);
}

public class Demo6 {

	public static void main(String[] args) {

		Scan s = (flag) -> {

			return flag.equalsIgnoreCase("samir");
		};
		System.out.println(s.scanning("SAMIR"));
	}
}
