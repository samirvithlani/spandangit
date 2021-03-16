package arraylist;

import java.util.ArrayList;

class Student{
	
	int sId;
	String sName;
	
	public Student(int sId, String sName) {
	
		this.sId = sId;
		this.sName = sName;
	}
	
	
}
public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		Student s1 = new Student(101, "spanadan");
		Student s2 = new Student(102, "jay");
		Student s3 = new Student(103, "raj");
		Student s4 = new Student(104, "priya");
		Student s5 = new Student(105, "neha");
		
		///add all objects to students type arraylist
		//object data 
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		for(Student s:list){
			
			System.out.println("name ="+s.sName+"id ="+s.sId);
		}
		
		
				
				
		
		
	}
}
