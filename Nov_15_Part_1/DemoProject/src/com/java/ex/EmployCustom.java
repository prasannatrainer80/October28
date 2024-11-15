package com.java.ex;

import java.util.Scanner;

public class EmployCustom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employ employ = new Employ();
		System.out.println("Enter Employ Details (empno, name, basic)   ");
		employ.setEmpno(sc.nextInt());
		employ.setName(sc.next());
		employ.setBasic(sc.nextDouble());
		
		System.out.println("Employ No  " +employ.getEmpno());
		System.out.println("Employ Name  " +employ.getName());
		System.out.println("Basic   " +employ.getBasic());
	}
}
