package com.java.day2;

public class Quiz9 {

	public static void main(String[] args) {
		int i=12;
		int j = i++ + ++i + i++ + i-- + --i;
		System.out.println(j);
	}
}
