package com.java.basics.objectclass;

/**
 * Anonymous simply means nameless. An object which has no reference is known as
 * an anonymous object. It can be used at the time of object creation only.
 * 
 * If you have to use an object only once, an anonymous object is a good
 * approach
 * 
 * @author kbhat
 *
 */
public class AnonymousTest {

	public static void main(String[] args) {
		new Anonymous().insert(101, "Karthik");
		// new Anonymous().display();
		// System.out.println(id+ " " +name);
	}
}