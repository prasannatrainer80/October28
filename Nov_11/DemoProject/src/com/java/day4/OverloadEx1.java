package com.java.day4;

public class OverloadEx1 {

	public void show(int x) {
		System.out.println("Show method w.r.t. Integer  " +x);
	}
	
	public void show(String x) {
		System.out.println("Show Method w.r.t. String  " +x);
	}
	
	public void show(float x) {
		System.out.println("Show Method w.r.t. Float  " +x);
	}
	
	public void show(double x) {
		System.out.println("Show Method w.r.t. Double  " +x);
	}
	
	public void show(boolean x) {
		System.out.println("Show Method w.r.t. Boolean  " +x);
	}
	
	public static void main(String[] args) {
		OverloadEx1 obj = new OverloadEx1();
		obj.show(12);
		obj.show(12.5f);
		obj.show(12.5);
		obj.show("Hexaware");
		obj.show(true);
	}
}