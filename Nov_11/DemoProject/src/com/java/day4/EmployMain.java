package com.java.day4;

public class EmployMain {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno = 1;
		employ1.name = "Amega";
		employ1.basic = 88234;
		
		Employ employ2 = new Employ();
		employ2.empno = 3;
		employ2.name = "Pranav";
		employ2.basic = 88811;
		
		System.out.println(employ1);
		System.out.println(employ2);
//		System.out.println("Employ No " +employ1.empno + " Name  " +employ1.name + 
//				" Basic " +employ1.basic);
//		System.out.println("Employ No " +employ2.empno + " Name  " +employ2.name + 
//				" Basic " +employ2.basic);
		
	}
}
