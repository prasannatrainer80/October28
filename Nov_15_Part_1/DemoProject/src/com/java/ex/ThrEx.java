package com.java.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrEx {

	public void check(int n) {
		if (n < 0) {
			throw new ArithmeticException("Negative Numbers not allowed...");
		} else if (n == 0) {
			throw new InputMismatchException("Zero is Invalid Value...");
		} else {
			System.out.println("N Value is  " +n);
		}
	}
	
	public static void main(String[] args) {
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number   ");
		n = sc.nextInt();
		ThrEx obj = new ThrEx();
		try {
			obj.check(n);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
