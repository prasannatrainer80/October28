package com.java.day2;

public class ArrayCopy {

	public void show() {
		int[] a = {12,5,22,55};
		int[] b = a;
		for (int i : b) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		new ArrayCopy().show();
	}
}
