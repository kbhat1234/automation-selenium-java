package com.java.basics.objectclass;

public class Rectangle {
	int length;
	int width;
	static int area;
	
	void insert(int a, int b) {
		length=a;
		width=b;
	}
	
	void display() {
		System.out.println(area);
	}
	void calculateArea() {
		area=length*width;
	}
}
