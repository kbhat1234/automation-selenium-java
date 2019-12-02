package com.java.basics.constructors;

public class ParameterizedConstructor {

	int id;
	String name;
	int age;

	public ParameterizedConstructor(int i, String n) {
		id = i;
		name = n;
	}

	public ParameterizedConstructor(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		ParameterizedConstructor c1 = new ParameterizedConstructor(1001, "Karthik");
		ParameterizedConstructor c2 = new ParameterizedConstructor(1002, "Kaustubh",1);
		//ParameterizedConstructor c3 = new ParameterizedConstructor(1003,44); //error as two int parameters
		
		c1.display();
		c2.display();
	}
}
