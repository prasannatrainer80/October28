package com.java.day6;

class Data<T> {
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value  " +a+ " B value  " +b);
		if (t instanceof Integer) {
			int x = (Integer)a;
			int y = (Integer)b;
			
			System.out.println(x+y);
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		int a = 5, b = 7;
		Data data = new Data();
		data.swap(a, b);
		String s1="Amega",s2="Trisha";
		data.swap(s1, s2);
		boolean b1 = true, b2= false;
		data.swap(b1, b2);
		Employ e1 = new Employ(1, "RajBharath", 88482);
		Employ e2 = new Employ(2, "Dilip", 88882.33);
		data.swap(e1, e2);
	}
}
