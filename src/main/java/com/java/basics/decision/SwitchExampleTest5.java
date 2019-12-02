package com.java.basics.decision;

public class SwitchExampleTest5 {

	public static void main(String[] args) {
		String levelString="expert";
		int level=0;
		switch(levelString) {
		case "Beginner": case "BEGINNER": case "beginner":
			level=1;
			break;
		case "Intermediate": case "INTERMEDIATE": case "intermediate":
			level=2;
			break;
		case "Expert": case "EXPERT": case "expert":
			level=3;
			break;
		default:
			level=0;
			break;
		}
		System.out.println("Your level is "+level);
	}

}
