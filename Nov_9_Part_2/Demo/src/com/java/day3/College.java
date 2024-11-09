package com.java.day3;

public class College {

	public void info(Object obj) {
		String type = obj.getClass().getSimpleName();
		if (type.equals("Student")) {
			Student ob = (Student)obj;
			System.out.println("Students go to Block A...");
			System.out.println(ob.sid + "  " +ob.sname);
		}
		
		if (type.equals("Admin")) {
			Admin ob = (Admin)obj;
			System.out.println("Admin Team Please Go to Block C...");
			System.out.println(ob.aid + "  " +ob.adminName);
		}
		
		if (type.equals("Faculty")) {
			Faculty ob = (Faculty)obj;
			System.out.println("Teaching Staff Please Go To Block C Division 5");
			System.out.println(ob.fid + " " +ob.fname);
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.sid=1;
		s1.sname="Guru";
		
		Admin a1 = new Admin();
		a1.aid=1;
		a1.adminName="Sudha";
		
		Faculty f1 = new Faculty();
		f1.fid = 1;
		f1.fname = "Prasanna";
		
		College college = new College();
		college.info(s1);
		college.info(a1);
		college.info(f1);
	}
}
