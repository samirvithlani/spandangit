package overloading;

public class Shape {

	void getArea(int h) {

		System.out.println("SQUARE GET AREA methof called");
		int area = h * h;
		System.out.println("area = " + area);
	}

	void getArea(int h, int w) {

		System.out.println("RECT GET AREA methof called");
		int area = h * w;
		System.out.println("area of rect = " + area);

	}

	void getArea(float r) {

		System.out.println("Circle GET area function called..");
		double area = (3.14 * r) * 2;
		System.out.println("AREA OF CIRCLE  = " + area);

	}

	void getArea(int h, float r, int w) {

		System.out.println("Triangle geta area function called..");
		double area = (h + w) * r;
		System.out.println("area of Triangle  = " + area);
	}

	public static void main(String[] args) {
		
		
		
		Shape s = new Shape();
		s.getArea(12.0f);
		s.getArea(12);
		s.getArea(12,25);
		s.getArea(12,12.0f,50);
		

	}

}
