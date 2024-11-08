package com.java.day2;

public class Quiz5 {

	public void show() {
		int[] a = {12,5};
		int[] b =a;
		a[1]=8;
		System.out.println(a[1] + "" +b[1]);
	}
	public static void main(String[] args) {
		Quiz5 obj = new Quiz5();
		obj.show();
	}
}
