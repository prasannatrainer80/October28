package com.java.day1;

import java.util.Scanner;

/**
 * Program to Perform Calculation (sum,sub,multiplication) of 2 numbers
 * Program by Prasanna
 * For Hexaware
 */

public class Calculation {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a + b;
		System.out.println("Sum is   " +c);
		c = a - b;
		System.out.println("Sub is  " +c);
		c = a * b;
		System.out.println("Mult is  " +c);
	}
}
