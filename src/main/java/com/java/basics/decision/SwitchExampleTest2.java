package com.java.basics.decision;

//program to demonstrate the example of switch statement
//where we are printing month name for the given number

public class SwitchExampleTest2 {

	public static void main(String[] args) {

		int month=4;
		String monthName="";
		switch(month) {
		
		case 1:
			monthName="January";
			break;
		
		case 2:
			monthName="Febrauary";
			break;
			
		case 3:
			monthName="March";
			break;
			
		case 4:
			monthName="April";
			break;
			
		case 5:
			monthName="May";
			break;
			
		case 6:
			monthName="June";
			break;
			
		case 7:
			monthName="July";
			break;
			
		case 8:
			monthName="August";
			break;
			
		case 9:
			monthName="September";
			break;
			
		case 10:
			monthName="October";
			break;
			
		case 11:
			monthName="November";
			break;
			
		case 12:
			monthName="December";
			break;
			
		default:
			monthName="invalid month ";
			break;
		}
		System.out.println("Selected month is "+monthName);
	}
}