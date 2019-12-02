package com.java.basics.constructors;

public class CopyConstructor1 {
	int id;
	String name;
	
	CopyConstructor1(){
	}
	
	CopyConstructor1(int i, String n){
		id=i;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String args[]) {
		CopyConstructor1 c1 = new CopyConstructor1(); //default constructor
		c1.display();
		CopyConstructor1 c2 = new CopyConstructor1(123,"Karthik");
		c2.display();
		CopyConstructor1 c3 = new CopyConstructor1();
		c3.id=c2.id;
		c3.name=c2.name;
		c3.display();
	}
}
