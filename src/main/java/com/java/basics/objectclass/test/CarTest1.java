package com.java.basics.objectclass.test;

public class CarTest1 {

	public static void main(String[] args) {
		Car1 c= new Car1();
		c.bLeftHandDrive=true;
		c.iDoors=4;
		c.iGear=5;
		c.iHighestSpeed=200;
		c.iMake=2010;
		c.iTyres=4;
		c.getCarDetails();
		c.displayCarDetails();

	}

}

class Car1{
	boolean bLeftHandDrive;
	int iDoors;
	int iGear;
	int iHighestSpeed;
	int iMake;
	int iTyres;
	
	public void getCarDetails() {
		iDoors=4;
		iGear=5;
		iHighestSpeed=100;
		iMake=2014;
		iTyres=4;
		bLeftHandDrive=true;
	}

	public void displayCarDetails() {
		System.out.println(bLeftHandDrive);
		System.out.println(iDoors);
		System.out.println(iGear);
		System.out.println(iHighestSpeed);
		System.out.println(iMake);
		System.out.println(iTyres);
}
}