package com.java.basics.objectclass;

public class Student3Test {

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		s1.getData(2002, "Karthik");
		s2.getData(2009, "Kaustubh");
		s1.putData();
		s2.putData();
		
	}
}