package com.java.basics.oop;

/**@author kbhat
 * @version 1.2.2
 * @since 2019-11-27
 *
 */
public class JavaDocumentationCommentTest extends Calculator {

	public static void main(String[] args) {
		//Calculator.addition(20, 5);
		//Calculator.sub(20, 5);
		System.out.println(Calculator.addition(20, 5));
		System.out.println(Calculator.sub(20, 5));
	}
}

class Calculator{
	public static int addition(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}