package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortExample {

	public static void main(String[] args) {
		List lstNames = new ArrayList();
		lstNames.add("Jansu");
		lstNames.add("Vignesh");
		lstNames.add("Archana");
		lstNames.add("Trisha");
		lstNames.add("Praveen");
		lstNames.add("Jashwanth");
		lstNames.add("Varshini");
		
		System.out.println("Sorted Data   ");
		Collections.sort(lstNames);
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
	}
}
