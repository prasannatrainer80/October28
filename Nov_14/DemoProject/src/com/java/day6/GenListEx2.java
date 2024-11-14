package com.java.day6;

import java.util.ArrayList;
import java.util.List;

public class GenListEx2 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(new Integer(32));
		numbers.add(new Integer(11));
		numbers.add(new Integer(88));
		numbers.add(new Integer(18));
		numbers.add(new Integer(17));
		numbers.add(new Integer(11));
		numbers.add(new Integer(52));
//		numbers.add("Hello");
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
}
