package com.java.day4;

import java.util.Scanner;

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumEx1 {
	public static void main(String[] args) {
		WeekDays wd = WeekDays.WEDNESDAY;
		System.out.println(wd);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any WeekDay Name  ");
		String wk = sc.next().toUpperCase();
		
		WeekDays wd1 = WeekDays.valueOf(wk);
		System.out.println(wd1);
	}
}
