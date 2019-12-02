package com.java.basics.objectclass;

public class Employee {

	int id;
	String name;
	double salary;
	
	public void insert(int i, String n, double s) {
		id=i;
		name=n;
		salary=s;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}
