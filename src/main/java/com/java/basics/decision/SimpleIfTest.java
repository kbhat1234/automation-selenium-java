package com.java.basics.decision;

public class SimpleIfTest {
	
	static String sDay="Tuesday";
	static int iDay=2;
	
	public static void main(String[] args) {
		if(sDay.equals("Monday")) {
			System.out.println("Today is Monday");
		}
		if(iDay==1) {
			System.out.println("Today is Monday");
		}
		System.out.println("End the program");
	}
}