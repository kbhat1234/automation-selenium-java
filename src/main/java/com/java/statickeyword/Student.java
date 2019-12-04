package com.java.statickeyword;

public class Student {

	int rollno;
	String name;
	static String college="NITTE";
	
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	
	void display() {
		System.out.println("Roll No: "+rollno+ " Name: "+name+ " College: "+college);
	}
}