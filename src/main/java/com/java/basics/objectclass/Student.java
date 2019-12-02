package com.java.basics.objectclass;
/**
 * In this example, we have created a Student class which has two data members id and name.
 * We are creating the object of the Student class by new keyword and printing the object's value.
 * @author kbhat
 *
 */
public class Student {
	//instance variables
	int id;
	String name;
	
	public static void main(String args[]) {
		
		//creating object or instance
		Student s1 = new Student();
		//s1.id=2345;
		//s1.name="Karthik";
		
		//printing values of the object
		System.out.println(s1.id); //accessing member through reference variable
		System.out.println(s1.name);
		System.out.println(s1.id+ " " +s1.name);
	}
}
