package com.java.basics.decision;

public class SwitchExampleNestedTest6 {

	public static void main(String[] args) {
		char branch='d';
		int year=4;
		
		switch(year) {
		case 1:
			System.out.println("English, Maths, Science, Chemisty");
			break;
		default:
			System.out.println("None of the options");
			break;
			
		case 2:
			switch(branch) {
			case 'c': case 'C':
				System.out.println("OS, data structures, java");
				break;
			case 'e': case 'E':
				System.out.println("Microprocessors, data signals, networks");
				break;
			case 'm': case 'M':
				System.out.println("Drawing, TOM, SOM");
				break;
			default:
				System.out.println("None of the options");
				break;
			}
			break;
			
		case 3:
			switch(branch) {
			case 'c': case 'C':
				System.out.println("graphics, c, c#");
				break;
			case 'e': case 'E':
				System.out.println("signal and systems, electronic circuits, digital networks");
				break;
			case 'm': case 'M':
				System.out.println("machine tuning, injectors theory");
				break;
			default:
				System.out.println("None of the options");
				break;
			}
			break;
			
		case 4:
			switch(branch) {
			case 'c': case 'C':
				System.out.println("computer networks, computer architectue, compiler design");
				break;
			case 'e': case 'E':
				System.out.println("advance Microprocessors, advanced data signals, computer networks");
				break;
			case 'm': case 'M':
				System.out.println("machine Drawing, machine TOM, machine SOM");
				break;
			default:
				System.out.println("None of the options");
				break;
			}
			break;
		}
	}
}