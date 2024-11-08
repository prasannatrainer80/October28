package com.java.day2;

import java.util.Scanner;

public class ArrayExample3 {
	static Scanner sc = new Scanner(System.in);
	public void show(int n) {
		String[] names = new String[n];
		System.out.println("Enter " +n + " Names ");
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
		System.out.println("Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter Size for Array  ");
		n = sc.nextInt();
		ArrayExample3 obj = new ArrayExample3();
		obj.show(n);
	}
}
