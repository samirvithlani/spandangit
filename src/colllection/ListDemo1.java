package colllection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * priimitive da
 * 
 */
class Student {

	int sId;
	String sName;

	public Student(int sId, String sName) {

		this.sId = sId;
		this.sName = sName;
	}

}

public class ListDemo1 {

	///instance arryaliSt
	static List<Student> studentsList = new ArrayList<Student>();

	public void addStudent() {

		String sName = null;
		int sId = 0;
		/*
		 * Student s1 = new Student(101, "jay"); Student s2 = new Student(102,
		 * "raj"); Student s3 = new Student(103, "spandan"); Student s4 = new
		 * Student(104, "parth"); Student s5 = new Student(105, "jiya");
		 */

		System.out.println("how many students you want to add");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {

			System.out.println("pls enter studetnt id");
			sId = sc.nextInt();
			System.out.println("pls enter student name:-");
			sName = sc.next();

			Student student = new Student(sId, sName);
			studentsList.add(student);
		}

		/*
		 * studentsList.add(s1); studentsList.add(s2); studentsList.add(s3);
		 * studentsList.add(s4); studentsList.add(s5);
		 */
	}

	public void printStudents() {

		for (Student s : studentsList) {

			System.out.println(s.sId + "-" + s.sName);
		}
	}

	public static void main(String[] args) {

		ListDemo1 l1 = new ListDemo1();
		l1.addStudent();
		l1.printStudents();

	}
}
