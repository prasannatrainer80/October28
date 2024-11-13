package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List lstNames = new ArrayList();
		lstNames.add("Jansu");
		lstNames.add("Vignesh");
		lstNames.add("Archana");
		lstNames.add("Trisha");
		lstNames.add("Praveen");
		lstNames.add("Jashwanth");
		lstNames.add("Varshini");
		
		System.out.println("Array List Data is  ");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
		
		lstNames.add(3, "Dilip");
		System.out.println("List ater Insert Operation  ");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
		
		lstNames.set(3, "Dharani");
		System.out.println("List after Update Operation ");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
		
		lstNames.remove("Praveen");
		System.out.println("List after Remove Operation  ");
		for (Object ob : lstNames) {
			System.out.println(ob);
		}
	}
}
