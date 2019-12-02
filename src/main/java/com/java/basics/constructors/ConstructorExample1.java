package com.java.basics.constructors;
//default constructor example
public class ConstructorExample1 {
	
	int id;
	String name;
	int age;
	ConstructorExample1(){
		System.out.println("No argument - Default Constructor");
	}
	
	ConstructorExample1(int i, String n){
		System.out.println("2 argument - Parameterized constructor");
		id=i;
		name=n;
	}
	
	ConstructorExample1(int i, String n, int a){
		System.out.println("3 argument - Parameterized constructor");
		id=i;
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println(id+ " "+name);
	}

	public static void main(String args[]) {
		ConstructorExample1 c1 = new ConstructorExample1();
		c1.display();
		ConstructorExample1 c2 = new ConstructorExample1(1001,"Karthik Bhat");
		c2.display();
		ConstructorExample1 c3 = new ConstructorExample1(1001,"Karthik Bhat",40);
		c3.display();
	}
}
