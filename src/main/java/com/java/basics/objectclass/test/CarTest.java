package com.java.basics.objectclass.test;

import com.java.basics.objectclass.Car;

public class CarTest {

	public static void main(String[] args) {
		Car c= new Car();
		c.bLeftHandDrive=true;
		c.iDoors=4;
		c.iGear=5;
		c.iHighestSpeed=200;
		c.iMake=2010;
		c.iTyres=4;
		//c.getCarDetails();
		c.displayCarDetails();
	}
}