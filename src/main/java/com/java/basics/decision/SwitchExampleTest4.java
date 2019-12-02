package com.java.basics.decision;

//The Java switch statement is fall-through. 
//It means it executes all statements after the first match if a break statement is not present.

public class SwitchExampleTest4 {

	public static void main(String[] args) {
		int number = 10;
		switch (number) {
		case 10:
			System.out.println("10");

		case 20:
			System.out.println("20");
			break;

		case 30:
			System.out.println("30");

		case 40:
			System.out.println("40");

		default:
			System.out.println("invalid number for case options");
			break;
		}

	}

}
