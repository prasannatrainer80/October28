package com.java.div;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEx2 {

	public void convert(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(strDate);
		System.out.println(date);
	}
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		String date;
		System.out.println("Enter Date (yyyy-MM-dd) ");
		date = sc.next();
		DateEx2 obj = new DateEx2();
		try {
			obj.convert(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
