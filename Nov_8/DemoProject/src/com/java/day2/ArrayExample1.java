package com.java.day2;

public class ArrayExample1 {

	public void show() {
		int[] a = new int[] {12,44,3,55,23};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ArrayExample1 obj = new ArrayExample1();
		obj.show();
	}
}
