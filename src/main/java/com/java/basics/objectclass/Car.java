package com.java.basics.objectclass;

public class Car {
	
	public boolean bLeftHandDrive;
	public int iDoors;
	public int iGear;
	public int iHighestSpeed;
	public int iMake;
	public int iTyres;
	
	/**boolean bLeftHandDrive;
	int iDoors;
	int iGear;
	int iHighestSpeed;
	int iMake;
	int iTyres;*/
	
	/**public void getCarDetails() {
		iDoors=4;
		iGear=5;
		iHighestSpeed=100;
		iMake=2014;
		iTyres=4;
		bLeftHandDrive=true;
	}*/

	public void displayCarDetails() {
		System.out.println(bLeftHandDrive);
		System.out.println(iDoors);
		System.out.println(iGear);
		System.out.println(iHighestSpeed);
		System.out.println(iMake);
		System.out.println(iTyres);
	}
}