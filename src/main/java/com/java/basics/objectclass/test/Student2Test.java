package com.java.basics.objectclass.test;
import com.java.basics.objectclass.*;

public class Student2Test {

	public static void main(String[] args) {
		Student2 st2 = new Student2();
		st2.getData();
		st2.putData();
		Student2 st3 = new Student2();
		Student2 st4 = new Student2();
		
		st3.id=2030;
		st3.name="Kaustubh";
		
		System.out.println(st3.id);
		System.out.println(st3.name);
		
		st4.id=2039;
		st4.name="Ishani";
		
		System.out.println(st4.id);
		System.out.println(st4.name);
	}
}