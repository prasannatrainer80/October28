package com.java.day1;

import java.util.Scanner;

public class CtoF {

	public static void main(String[] args) {
		double c, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Centigrade Value  ");
		c = sc.nextDouble();
		f = ((9 * c)/5) + 32;
		System.out.println("Fahrenheit Value  " +f);
	}
}
