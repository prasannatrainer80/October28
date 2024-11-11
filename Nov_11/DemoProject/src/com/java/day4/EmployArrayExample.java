package com.java.day4;

public class EmployArrayExample {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		employ1.empno = 1;
		employ1.name = "Amega";
		employ1.basic = 88234;
		
		Employ employ2 = new Employ();
		employ2.empno = 3;
		employ2.name = "Pranav";
		employ2.basic = 88811;

		Employ employ3 = new Employ();
		employ3.empno = 4;
		employ3.name = "Samyuktha";
		employ3.basic = 90022;

		Employ employ4 = new Employ();
		employ4.empno = 5;
		employ4.name = "Saily";
		employ4.basic = 90002;

//		int[] a = new int[] {1,2,3,4};
		Employ[] arr = new Employ[] {employ1, employ2, employ3, employ4};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
