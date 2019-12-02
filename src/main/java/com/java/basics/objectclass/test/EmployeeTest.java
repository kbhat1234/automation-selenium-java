package com.java.basics.objectclass.test;

import com.java.basics.objectclass.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(), e2=new Employee();
		e1.insert(202, "Karthik", 200000.92);
		e1.display();
		e2.display();

	}

}
