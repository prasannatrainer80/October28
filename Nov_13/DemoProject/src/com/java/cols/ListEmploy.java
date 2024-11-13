package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Jansu", 99423.44));
		employList.add(new Employ(2, "Amega", 90022.44));
		employList.add(new Employ(3, "Harshavardhini", 98823.44));
		employList.add(new Employ(4, "Rajbharah", 90883.44));
		employList.add(new Employ(5, "Praveen", 90011.44));
		employList.add(new Employ(6, "RajBharath", 98822.44));
		System.out.println("Employ List  ");
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
