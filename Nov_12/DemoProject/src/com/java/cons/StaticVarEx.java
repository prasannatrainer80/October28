package com.java.cons;

public class StaticVarEx {

	static int count;
	public void increment() {
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		StaticVarEx obj1 = new StaticVarEx();
		StaticVarEx obj2 = new StaticVarEx();
		StaticVarEx obj3 = new StaticVarEx();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
	}
}
