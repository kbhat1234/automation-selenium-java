package com.java.basics.decision;

public class IfElseStatementTest {

	public static void main(String[] args) {
		String sDay="Monday";
		int iDay=1;
		
		if(sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		}
		else {
			System.out.println("Today is not Sunday");
		}

		if(iDay==7) {
			System.out.println("Today is Sunday");
		}
		else {
			System.out.println("Today is not Sunday");
		}
	System.out.println("Thanks for tests");
	}
}
