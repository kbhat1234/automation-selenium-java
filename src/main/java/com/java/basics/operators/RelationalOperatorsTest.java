package com.java.basics.operators;

public class RelationalOperatorsTest {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		System.out.println("Greater than operator");
		System.out.println(a>b);//false
		System.out.println(b>a);//true
		System.out.println(c>b);//true
		System.out.println(a>c);//false
		
		System.out.println("Lesser than operator");
		System.out.println(a<b);//true
		System.out.println(a<c);//true
		System.out.println(b<c);//true
		System.out.println(c<a);//false
		System.out.println(c<b);//false
		
		System.out.println("Greater than or equal to operator");
		System.out.println(a>=b);//false
		System.out.println(a>=c);//false
		System.out.println(b>=c);//false
		System.out.println(c>=a);//true
		System.out.println(b>=a);//true
		
		System.out.println("Lesser than or equal to operator");
		System.out.println(a<=b);//true
		System.out.println(a<=c);//true
		System.out.println(b<=c);//true
		System.out.println(c<=a);//false
		System.out.println(b<=a);//false
		
		System.out.println("Equal to operator");
		System.out.println(a==b);//false
		System.out.println(a==c);//false
		System.out.println(b==c);//false
		System.out.println(c==(a+b));//true
		System.out.println(b==(c-a));//true
		
		System.out.println("Not equal to operator");
		System.out.println(a!=b);//true
		System.out.println(a!=c);//true
		System.out.println(b!=c);//true
		System.out.println(c!=a);//true
		System.out.println(c!=b);//true
		System.out.println(a!=(b-a));//false
	}

}