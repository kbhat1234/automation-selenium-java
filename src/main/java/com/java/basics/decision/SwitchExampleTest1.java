/**javadoc
 * @author kbhat
 * @version 2.2.2
 * @since 2014-03-23
 * @see IOException
 */
package com.java.basics.decision;

public class SwitchExampleTest1 {

	public static void main(String[] args) {
		int number1=60;
		int number2=33;
		
		switch(number1) {
		case 10:
			System.out.println("10");
			//break;
		
		case 20:
			System.out.println("20");
			break;
			
		case 30:
			System.out.println("30");
			//break;
			
		case 40:
			System.out.println("40");
			//break;
		
		case 50:
			System.out.println("50");
			break;
		
		case 60:
			System.out.println("60");
			//break;
			
		default:
			//System.out.println("End of number1");
			System.out.println("none of the options above");
			break;
		}
		
		switch(number2) {
		case 10:
			System.out.println("10");
			//break;
		
		case 20:
			System.out.println("20");
			break;
			
		case 30:
			System.out.println("30");
			//break;
			
		case 40:
			System.out.println("40");
			break;
			
		default:
			//System.out.println("end of number2");
			System.out.println("none of the options above");
			break;
		}

	}

}
