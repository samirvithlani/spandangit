package spandan_core_java;

class Shape {

	int height;
	int width;

	public int setHeight(int h) {

		height = h;
		return height;
	}

	public int setWidth(int w) {

		width = w;

		return width;
	}

}

class Circle extends Shape {

	public void getCircleArea() {

		height = setHeight(20);
		width = setWidth(50);
		System.out.println("area of circle  = " + (height * width) * 3.14);
	}
}

class Triangle extends Shape {

	public void getTriangleArea() {

		height = setHeight(15);
		width = setWidth(25);
		System.out.println("area of Triangle  = " + (height + width) / 2);
	}
}

class Square extends Shape {

	public void getSquare() {
		height = setHeight(50);
		width = setHeight(50);
		System.out.println("area of square  = " + height * width);
	}

}

public class ShapeTest {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.getCircleArea();
		Triangle t = new Triangle();
		t.getTriangleArea();
		Square s = new Square();
		s.getSquare();

	}

}
