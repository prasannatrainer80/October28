package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
//		Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employList = new TreeSet(c);
		employList.add(new Employ(1, "Jansu", 99423.44));
		employList.add(new Employ(2, "Amega", 90022.44));
		employList.add(new Employ(3, "Harshavardhini", 98823.44));
		employList.add(new Employ(4, "Rajbharah", 90883.44));
		employList.add(new Employ(5, "Praveen", 90011.44));
		employList.add(new Employ(6, "Vignesh", 98822.44));
		
		System.out.println("Sorted Employ Records  ");
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
