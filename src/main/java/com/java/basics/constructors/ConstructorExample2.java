package com.java.basics.constructors;

//default constructor with default values which is parameterized

public class ConstructorExample2 {

	int id;
	String name;
	
	ConstructorExample2(){
		//id=101;
		//name="Karthik";
	}
	
	ConstructorExample2(int i, String n){
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println(id+ " "+name);
	}
	
	public static void main(String args[]) {
		ConstructorExample2 c1 = new ConstructorExample2(100,"Karthik");
		c1.display();
	}
}
