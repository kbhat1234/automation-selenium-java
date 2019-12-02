package com.java.basics.objectclass;

public class Anonymous {
	int id;
	String name;
	
	void insert(int i, String n) {
		id=i;
		name=n;
		System.out.println(id+ " " +name);
	}
	
	void display() {
		System.out.println(id+ " " +name);
	}
}