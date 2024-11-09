package com.java.day3;

public class StrExamples {

	public void show() {
		String str = "Welcome to Java Programming...Trainer Prasanna...Java Hexaware";
		System.out.println("Length of String is  " +str.length());
		System.out.println("First Occurrence of char 'o' is   " +str.indexOf("o"));
		System.out.println("Last Occurrence of char 'o' is  " +str.lastIndexOf("o"));
		System.out.println("Char at 5th position is  " +str.charAt(5));
		String s1="Sundhara",s2="Varsha",s3="Sundhara";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("Upper Case String  " +str.toUpperCase());
		System.out.println("Lower Case String  " +str.toLowerCase());
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println("Part of String  " +str.substring(5,10));
		System.out.println("Replaced String is " +str.replace("Java", "J2EE"));
	}
	public static void main(String[] args) {
		StrExamples obj = new StrExamples();
		obj.show();
	}
}
