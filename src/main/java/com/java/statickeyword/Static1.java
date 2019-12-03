package com.java.statickeyword;

/*public class Static1 {
	static final String sum="Sum: ";
	static final String diff="Differnce: ";
	
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int s=a+b;
		int d=a-b;
	
		System.out.println(sum+s);
		System.out.println(diff+d);
	}

}*/

/*class NonStaticTest {
	//non static variable
	String s1 = "Karthik";
	int a = 20;
}

public class Static1 {
	public static void main(String[] args) {
		NonStaticTest ns = new NonStaticTest();
		System.out.println(ns.a);
		System.out.println(ns.s1);
	}
}*/

class StaticTest {
	int a = 20;
	static String s1 = "Welcome to static variable test";
}

public class Static1 {
	public static void main(String args[]) {

		StaticTest st = new StaticTest();
		System.out.println(st.a);
		// System.out.println(StaticTest.a);

		System.out.println(StaticTest.s1);
	}
}