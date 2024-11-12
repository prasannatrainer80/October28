package com.java.cons;

public class StaticEx2 {

	static int count;
	public int show() {
		count++;
		return count;
	}
	
	public static void main(String[] args) {
		StaticEx2 obj1 = new StaticEx2();
		StaticEx2 obj2 = new StaticEx2();
		StaticEx2 obj3 = new StaticEx2();
		
		System.out.println(obj1.show());
		System.out.println(obj2.show());
		System.out.println(obj3.show());
	}
}
