package com.java.day4;

public class OverloadEx2 {
	
	public int sum() {
		return 5;
	}
	
	public int sum(int x) {
		return x + 5;
	}
	
	public int sum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		OverloadEx2 obj = new OverloadEx2();
		System.out.println("Sum w.r.t. Zero Args  " +obj.sum());
		System.out.println("Sum w.r.t. One Arg   " +obj.sum(53));
		System.out.println("Sum w.r.t. Two Arg  " +obj.sum(15, 53));
	}
}
