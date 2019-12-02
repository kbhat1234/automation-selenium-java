package com.java.basics.objectclass;

public class Student3 {
	int id;
	String name;
	
	void getData(int i, String n) {
		id=i;
		name=n;
	}
	
	void putData() {
		System.out.println(id+ " " +name);
	}
}