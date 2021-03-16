package string;

public class StrngDemo1 {

	public static void main(String[] args) {

		// index follow
		// index strat 0
		// position always starts with 1
		// index always starts with 0
		/// j -1 0
		/// a -2 1
		/// y -3 2
		String name = "jay";
		String name1 = "JAVA";

		System.out.println(name);
		name = name.toUpperCase();
		name1 = name1.toLowerCase();
		System.out.println("after upper case.." + name);
		System.out.println("lowercase =>" + name1);
		boolean flag = name.startsWith("j");
		if (flag == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		/*
		 * for(int i=0;i<=2;i++){ System.out.println(name.charAt(i)); }
		 */
	}
}
