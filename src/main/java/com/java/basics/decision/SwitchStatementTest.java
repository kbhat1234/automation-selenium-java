package com.java.basics.decision;

public class SwitchStatementTest {

	public static void main(String[] args) {
		int iDay = 4;
		String sDay = "MONDAY";

		switch (sDay) { 
		
		case "Monday": case "monday": case "MONDAY":
			System.out.println("Today is Monday");
			break;

		case "Tuesday": case "tuesday": case "TUESDAY":
			System.out.println("Today is Tuesday");
			break;

		case "Wednesday": case "wednesday": case "WEDNESDAY":
			System.out.println("Today is Wednesday");
			break;

		case "Thursday": case "thursday": case "THURSDAY":
			System.out.println("Today is Thursday");
			break;

		case "Friday": case "friday": case "FRIDAY":
			System.out.println("Today is Friday");
			break;

		case "Saturday": case "saturday": case "SATURDAY":
			System.out.println("Today is Saturday");
			break;
			
		case "Sunday": case "sunday": case "SUNDAY":
			System.out.println("Today is Saturday");
			break;

		default:
			System.out.println("Invalid day entry");
			break;
		}

		switch (iDay) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("invalid entry");
			break;
		}
		System.out.println("end of the program");
	}
}