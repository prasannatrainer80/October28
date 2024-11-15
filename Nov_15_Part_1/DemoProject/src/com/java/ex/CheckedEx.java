package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckedEx {

	public void convert(String strDate) throws ParseException {
		Date date;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		date = sdf.parse(strDate);
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		String strDate;
		System.out.println("Enter Date  (yyyy-MM-dd) format ");
		Scanner sc = new Scanner(System.in);
		strDate = sc.next();
		CheckedEx obj = new CheckedEx();
		try {
			obj.convert(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
