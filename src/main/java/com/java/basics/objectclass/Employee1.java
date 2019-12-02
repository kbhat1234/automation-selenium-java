package com.java.basics.objectclass;

public class Employee1 {
	int id;
	String name;
	double salary;

	/*void insert(int i, String n, Double s) {
		id = i;
		name = n;
		salary = s;
	}*/

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}