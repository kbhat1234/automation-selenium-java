package com.java.statickeyword;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(120,"Karthik");
		Student.college="MIT";
		s1.display();
		
		Student s2 = new Student(220,"Rini");
		Student.college="PESIT";
		s2.display();
		

	}

}
