package com.java.div;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionEx {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers   ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division  " +c);
		} catch (ArithmeticException e) {
			System.err.println("Division by zero impossible...");
		} catch (InputMismatchException e) {
			System.err.println("String Cannot be Converted as Integer...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program from Hexaware Segue...");
		}
	}
}
