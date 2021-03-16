package employeeManagement;

import java.util.Scanner;

//DRIVER CLASS

class EmployeeDetails {

	// instance
	String eName;
	String eEmail;
	String ePassword;
	int eAge;
	float eSalary;

	public boolean addEmployee() {

		// local variable.
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter employee Name :-");
		String eName = sc.next();
		System.out.println("pls enter employee email :-");
		String eEmail = sc.next();
		System.out.println("pls enter employee salary :-");
		float eSalry = sc.nextFloat();
		System.out.println("pls enter employee Password :-");
		String ePassword = sc.next();
		System.out.println("pls enter employee age :-");
		int eAge = sc.nextInt();

		this.eName = eName;
		this.eEmail = eEmail;
		this.eAge = eAge;
		this.ePassword = ePassword;
		this.eSalary = eSalry;

		return true;
	}

	public void displayEmployee() {

		System.out.println("EMployee Name =" + this.eName);
		System.out.println("EMployee Email =" + this.eEmail);
		System.out.println("Employee password =" + this.ePassword);
		System.out.println("employee age = " + this.eAge);
		System.out.println("employee saalry = " + this.eSalary);
	}

}

public class Employee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeDetails employeeDetails = new EmployeeDetails();
		int choice = 0;
		do {

			System.out.println("************************EMPLOYEE MANAGEMENT***********");
			System.out.println("pls enter your choice");
			System.out.println("ENTER 1 FOR REGISTER EMPLOYEE ");
			System.out.println("ENTER 2 FOR DISPLAY ALL EMPLOYEE ");
			System.out.println("ENTER 3 FOR EXIT ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				employeeDetails.addEmployee();
				break;
			case 2:
				employeeDetails.displayEmployee();
				break;

			default:
				System.out.println("THANKS WELOCME AGAIN");
				break;

			}

		} while (choice != 3);

	}

}
