package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEx {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Jansu");
		names.add("Vignesh");
		names.add("Archana");
		names.add("Trisha");
		names.add("Praveen");
		names.add("Jashwanth");
		names.add("Varshini");
		
		System.out.println("Sorted Data  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
