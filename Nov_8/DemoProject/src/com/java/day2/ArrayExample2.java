package com.java.day2;

public class ArrayExample2 {

	public void show() {
		String[] names = new String[] {
			"Sarath","Satyan","Jashwanth","Archana",
			"Varsha","Senthil"
		};
		
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ArrayExample2 obj = new ArrayExample2();
		obj.show();
	}
}
