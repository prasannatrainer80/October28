package com.java.day2;

import java.util.Scanner;

public class Max3 {
	
	public void show(int a, int b, int c) {
		int m = a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		System.out.println("Max Value  " +m);
	}
	
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Numbers   ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		Max3 obj = new Max3();
		obj.show(a, b, c);
	}
}
