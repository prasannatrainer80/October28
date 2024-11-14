package com.java.day6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new Hashtable<Integer, String>();
		map1.put(1, "Amega");
		map1.put(2, "Dilip");
		map1.put(3, "Misbah");
		map1.put(4, "Varshini");
		map1.put(5, "Raj");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		int empno = sc.nextInt();
		String result = map1.getOrDefault(empno, "Not Found");
		System.out.println(result);
	}
}
