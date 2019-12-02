package com.java.basics.objectclass;

public class Rectangle1Test {

	public static void main(String[] args) {
		Rectangle1 r1 = new Rectangle1(), r2 = new Rectangle1(); // creating 2 objects of same type
		r1.insert(10, 5);
		r1.calulateArea();
		r1.display();
		r2.insert(20, 6);
		r2.calulateArea();
		r2.display();
	}

}
