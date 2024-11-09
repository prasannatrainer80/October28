package com.java.day3;

public class StrTest {

	public static void main(String[] args) {
		String str="Sundhara,Dilip,Jashwanth,Praveen,Satyan,Sarath";
		String[] names = str.split(",");
		System.out.println("Separated Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
