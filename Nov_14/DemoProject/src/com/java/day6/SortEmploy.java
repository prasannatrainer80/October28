package com.java.day6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator<Employ> c = new NameComparator();
		Comparator<Employ> c = new BasicComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>(c);
		employList.add(new Employ(1, "Shimona", 99234.22));
		employList.add(new Employ(2, "Karthikram", 88882.22));
		employList.add(new Employ(3, "Pranav", 90022.22));
		employList.add(new Employ(4, "Vignesh", 81133.22));
		employList.add(new Employ(5, "Archana", 98823.22));
		employList.add(new Employ(6, "Rahul", 89922.22));
		
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
