package com.java.basics.datatypes;

public class IntegerTest extends IntOperation {

	public static void main(String[] args) {
		//int carSpeed=80;
		//System.out.println("car is running at a speed of "+carSpeed);
		//carSpeed=carSpeed+20;
		//System.out.println("car is running now at a speed of "+carSpeed);
		//carSpeed=carSpeed-30;
		//System.out.println("car is running now at a speed of "+carSpeed);
		IntOperation op = new IntOperation();
		op.carSpeed();

	}

}

class IntOperation {

	public void carSpeed() {
		int carSpeed=80;
		System.out.println("car is running at a speed of "+carSpeed);
		//int a=10, b=20, c=30;
		int a=10, b=20, c;
		c=30;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		System.out.println("value of c "+c);
	}
}
