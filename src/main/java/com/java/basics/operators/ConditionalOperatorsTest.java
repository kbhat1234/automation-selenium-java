package com.java.basics.operators;

public class ConditionalOperatorsTest {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		boolean bvalue;
		int ivalue;
		
		bvalue=(a==(b+c))?true:false;
		System.out.println(bvalue);//false
		
		ivalue=((a+b)==(c+b))?50:100;
		System.out.println(ivalue);

	}

}
