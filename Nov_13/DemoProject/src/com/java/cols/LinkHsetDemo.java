package com.java.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHsetDemo {
	public static void main(String[] args) {
		Set names = new LinkedHashSet();
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
