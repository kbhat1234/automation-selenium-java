package com.java.basics.objectclass;

/**
 * We can create multiple objects by one type only as we do in case of
 * primitives.
 * 
 */
public class Rectangle1 {
	int length;
	int width;
	int area;
	
	void insert(int l, int w) {
		length=l;
		width=w;
	}
	
	void calulateArea() {
		area=length*width;
	}

	void display() {
		System.out.println(length+ " " +width+ " " +area);
	}
}
