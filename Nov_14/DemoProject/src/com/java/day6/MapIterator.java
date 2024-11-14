package com.java.day6;

import java.util.Hashtable;
import java.util.Map;

public class MapIterator {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new Hashtable<Integer, String>();
		map1.put(1, "Amega");
		map1.put(2, "Dilip");
		map1.put(3, "Misbah");
		map1.put(4, "Varshini");
		map1.put(5, "Raj");
		
		for(Map.Entry<Integer, String> m : map1.entrySet()) {
			System.out.println("Key  " +m.getKey() + " Value  " +m.getValue());
		}
	}
}
