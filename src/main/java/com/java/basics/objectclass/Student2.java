package com.java.basics.objectclass;

//Initialization through reference

public class Student2 {
	public int id;
	public String name;
	
	public void getData() {
		id=20;
		name="Karthik";
	}
	
	public void putData() {
		System.out.println(id);
		System.out.println(name);
	}
}