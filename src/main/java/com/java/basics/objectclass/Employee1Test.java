package com.java.basics.objectclass;

public class Employee1Test {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1(); 
		Employee1 e3 = new Employee1();
		//e1.insert(2002, "ABC", 20000.67);
		
		e1.id=201;
		e1.name="ABC";
		e1.salary=20000.88;
		e1.display();
		//e2.insert(2003, "PQR", 222222.2);
		e2.display();
		//e3.insert(2012, "XYZ", 10000.33);
		e3.display();
	}
}