package com.java.basics.oop;

class A {
	void printA() {
		System.out.println("A class");
	}
}

class B extends A {
	void printB() {
		System.out.println("B class");
	}
}

class C extends B{
	void printC() {
		System.out.println("C class");
	}
}

public class D extends C {
	
	public static void main(String[] args) {
		C c = new C();
		c.printA();
		c.printB();
		c.printC();
	}
}