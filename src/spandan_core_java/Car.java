package spandan_core_java;

import java.util.Scanner;

class Vehicle {

	String vehName;
	String modelName;
	int makeYear;
}

public class Car extends Vehicle {

	public void getCarDetail() {

		System.out.println("car name =" + vehName);
		System.out.println("car model =" + modelName);
		System.out.println("car make year =" + makeYear);

	}

	public void addCarDetail() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter vehicle name :-");
		vehName = sc.next();
		System.out.println("enter model name :-");
		modelName = sc.next();
		System.out.println("enter make year :-");
		makeYear = sc.nextInt();

	}

	public static void main(String[] args) {

		Car c = new Car();
		c.addCarDetail();
		c.getCarDetail();

	}
}
