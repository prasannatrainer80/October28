package com.java.ex;

import java.util.Scanner;

public class Voting {

	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You are Not Elligible for Voting...");
		}
		System.out.println("You are Elligible for Voting...");
	}
	
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age   ");
		age = sc.nextInt();
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			System.err.println(e.getMessage());
		}
	}
}
