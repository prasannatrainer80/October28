package com.java.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Varshini", 99923.44);
		map.put("Dharshini", 93999.23);
		map.put("Karthik", 99234.22);
		map.put("Saily", 99322.42);
		map.put("Archana", 99423.44);
		String key;
		double result;
		System.out.println("Enter Key   ");
		key = sc.next();
		result = map.getOrDefault(key, 0.0);
		System.out.println(result);
	}
}
