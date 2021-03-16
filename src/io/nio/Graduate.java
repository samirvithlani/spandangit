package io.nio;

class Person{
	
}
class Student extends Person{
	
	
}
public class Graduate extends Student{

	public static void main(String[] args) {
		
		Person p = new Person();
		Student s = new Student();
		Graduate g  = new Graduate();
		
		p =g;
		p = new Graduate();
		g = new Student();
		g =p;
		s = new Person();
	}
}
