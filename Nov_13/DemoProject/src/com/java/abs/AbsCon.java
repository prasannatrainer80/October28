package com.java.abs;

class Jansu extends Employ {

	public Jansu(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Guru extends Employ {

	public Guru(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Dharani extends Employ {

	public Dharani(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

abstract class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}

public class AbsCon {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Dharani(1, "Dharani", 88234.22),
			new Jansu(2, "Jansu", 88823.21),
			new Guru(3, "Guru", 99923.44)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
