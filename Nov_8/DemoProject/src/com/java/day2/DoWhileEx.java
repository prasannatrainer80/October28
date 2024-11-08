package com.java.day2;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		int n;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a Number  ");
			n = sc.nextInt();
			System.out.println("Enter Choice(true/false) ");
			flag = sc.nextBoolean();
		} while(flag==true);
	}
}
