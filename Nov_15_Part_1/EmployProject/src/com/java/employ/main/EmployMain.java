package com.java.employ.main;

import java.util.List;
import java.util.Scanner;

import com.java.employ.bal.EmployBal;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;
import com.java.employ.model.Gender;

public class EmployMain {

	static Scanner sc = new Scanner(System.in);
	static EmployBal bal = new EmployBal();
	
	public static void showEmploy() {
		List<Employ> employList = bal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	
	public static void addEmploy() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ no ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(bal.addEmploy(employ));
	}
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Update Employ");
			System.out.println("4. Delete Employ");
			System.out.println("5. Search Employ");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addEmploy();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
				showEmploy();
				break;
			case 6 : return;
			}
		} while(choice!=7);
	}
}
