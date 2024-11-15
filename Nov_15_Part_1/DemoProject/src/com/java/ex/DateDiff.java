package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDiff {
	
	public int tat(Date startDate, Date endDate) {
		long ms = endDate.getTime() - startDate.getTime();
		long c = (ms / (1000 * 60 * 60 * 24));
		int days = (int)c;
		days++;
		return days;
	}
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner sc = new Scanner(System.in);
		Date startDate, endDate;
		DateDiff obj = new DateDiff();
		try {
			System.out.println("Enter Start Date (yyyy-MM-dd)   ");
			startDate = sdf.parse(sc.next());
			System.out.println("Enter End-Date  (yyyy-MM-dd)   ");
			endDate = sdf.parse(sc.next());
			int diff = obj.tat(startDate, endDate);
			System.out.println("Difference between two dates  " +diff);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
