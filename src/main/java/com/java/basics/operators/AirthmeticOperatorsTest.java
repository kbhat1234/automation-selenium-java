package com.java.basics.operators;

public class AirthmeticOperatorsTest {

	public static void main(String[] args) {
		int a=0,b=11,c=5;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
		
		//addition
		a=b+c;
		System.out.println("Value of a after addition (b+c) is "+a);
		a=b-c;
		System.out.println("Value of a after substraction (b-c) is "+a);
		a=b*c;
		System.out.println("Value of a after multiplication (b*c) is "+a);
		a=b/c;
		System.out.println("Value of a after division (b/c) is "+a);
		a=b%c;
		System.out.println("Value of a after modulus (b%c) is "+a);
		b++;
		System.out.println(b);
		c--;
		System.out.println(c);
		++b;
		System.out.println(b);
		--c;
		System.out.println(c);
	}

}
