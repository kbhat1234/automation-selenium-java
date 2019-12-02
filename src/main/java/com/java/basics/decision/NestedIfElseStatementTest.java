package com.java.basics.decision;

public class NestedIfElseStatementTest {

	public static void main(String[] args) {
		String sDay = "Saturday";
		int iDay = 6;

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");
		} else if (sDay.equals("Saturday")) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is a Weekday");
		}

		if (iDay == 7) {
			System.out.println("Today is Sunday");
		} else if (iDay == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is Weekday");
		}
	}

}
