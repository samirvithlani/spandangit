package blocks;

public class LabeledDemo {

	public static void main(String[] args) {

		int i = 0;
		outer : while (true) {

			inner : while (true) {
				
				i++;
				System.out.println("i =" + i);

				if (i == 3) {

					break inner;
				}
				
				break outer;
			}

		}

	}
}
