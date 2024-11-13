package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Jansu");
		names.add("Vignesh");
		names.add("Archana");
		names.add("Trisha");
		names.add("Praveen");
		names.add("Jashwanth");
		names.add("Varshini");
		names.add("Jansu");
		names.add("Vignesh");
		names.add("Archana");
		names.add("Trisha");
		names.add("Jansu");
		names.add("Vignesh");
		names.add("Archana");
		names.add("Trisha");
		names.add("Jansu");
		names.add("Vignesh");
		names.add("Archana");
		names.add("Trisha");
		names.add("Trisha");
		names.add("Praveen");
		names.add("Jashwanth");
		names.add("Trisha");
		names.add("Praveen");
		names.add("Jashwanth");
		names.add("Trisha");
		names.add("Praveen");
		names.add("Jashwanth");
		System.out.println("List is  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
