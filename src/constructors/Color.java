package constructors;

public class Color {

	int price; // INSTACNE VARIABLE/CLASS LEVEL VARIABLE..

	public Color() {
		
		price = 200;
		System.out.println("default constructor..");
	}

	void demo() {
	
		System.out.println("price = " + price);

	}

	public static void main(String[] args) {

		Color c1 = new Color();
		Color c2 = new Color();
		
		c1.demo();
		c2.demo();

	}
}
