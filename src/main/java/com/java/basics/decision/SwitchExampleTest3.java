package com.java.basics.decision;

public class SwitchExampleTest3 {

	public static void main(String[] args) {
		char ch='U';
		
		switch(ch) {
		case 'a': case 'A':
			System.out.println("Vowel");
			break;
			
		case 'e': case 'E':
			System.out.println("Vowel");
			break;
			
		case 'i': case 'I':
			System.out.println("Vowel");
			break;
			
		case 'o': case 'O':
			System.out.println("Vowel");
			break;
			
		case 'u': case 'U':
			System.out.println("Vowel");
			break;
			
		default:
			System.out.println("It is a consonant");
			break;
		}
	}
}