package com.java.sup;

class Employ {
	
	private int empno;
	private String name;
	private double basic;
	
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
}

class Satyan extends Employ {

	public Satyan(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Pranav extends Employ {

	public Pranav(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Amega extends Employ {

	public Amega(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

public class SupCon {

	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Amega(1, "Amega", 88842.33),
			new Pranav(2, "Pranav", 99925.22),
			new Satyan(3, "Satyan", 99992.43)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
