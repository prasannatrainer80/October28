package com.java.cons;

public class EmployArray {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Employ(1, "Amega", 99992.22),
			new Employ(2, "Pranav", 98823.22),
			new Employ(3, "Praveen", 97742.22),
			new Employ(4, "Sundhara", 96622.22),
		};
		System.out.println("Employ Records are  ");
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
