package com.java.ex;

public class EmployDemo {

	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.setEmpno(1);
		employ.setName("Sundhara Pandi");
		employ.setBasic(99923.33);
		
		System.out.println("Employ No   " +employ.getEmpno());
		System.out.println("Employ Name  " +employ.getName());
		System.out.println("Basic   " +employ.getBasic());
	}
}
