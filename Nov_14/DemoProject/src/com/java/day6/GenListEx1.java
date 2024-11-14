package com.java.day6;

import java.util.ArrayList;
import java.util.List;

public class GenListEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Jashwanth");
		names.add("Shivanika");
		names.add("Misba");
		names.add("Dilip");
		names.add("Jansu");
		names.add("Rajbharath");
//		names.add(12);
		
		for (String string : names) {
			System.out.println(string);
		}
	}
}
