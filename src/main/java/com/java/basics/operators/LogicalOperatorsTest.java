package com.java.basics.operators;

public class LogicalOperatorsTest {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		System.out.println(a&&b);//false
		System.out.println(a||b);//true
		System.out.println(!a);//false
		System.out.println(!b);//true
		int a1=10,b1=20;
		System.out.println((a1>b1)&&(a1<b1));//false
		System.out.println((a1>b1)||(a1<b1));//true
		System.out.println(!(b1>a1));//false
		System.out.println(!(a1==b1));//true

	}

}
