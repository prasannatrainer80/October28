package com.java.lms.main;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.java.lms.dao.EmployeeDao;
import com.java.lms.dao.EmployeeDaoImpl;
import com.java.lms.dao.LeaveHistoryDao;
import com.java.lms.dao.LeaveHistoryDaoImpl;
import com.java.lms.model.Employee;
import com.java.lms.model.LeaveHistory;
import com.java.lms.model.LeaveType;

public class LmsMain {

	static Scanner sc = new Scanner(System.in);
	
	static EmployeeDao employeeDao = new EmployeeDaoImpl();
	
	static LeaveHistoryDao leaveHistoryDao = new LeaveHistoryDaoImpl();
	
	public static void employeeShow() throws ClassNotFoundException, SQLException {
		List<Employee> employeeList = employeeDao.showEmployDao();
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
	
	public static void applyLeave() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveHistory leaveHistory = new LeaveHistory();
		System.out.println("Enter Employ Id  ");
		leaveHistory.setEmpId(sc.nextInt());
		System.out.println("Enter Leave-Start-Date  ");
		Date dt1 = sdf.parse(sc.next());
		java.sql.Date sqlDate1 = new java.sql.Date(dt1.getTime());
		leaveHistory.setLeaveStartDate(sqlDate1);
		System.out.println("Enter Leave-End Date  ");
		Date dt2 = sdf.parse(sc.next());
		java.sql.Date sqlDate2 = new java.sql.Date(dt2.getTime());
		leaveHistory.setLeaveEndDate(sqlDate2);
		System.out.println("Enter Leave Type EL/PL/ML ");
		leaveHistory.setLeaveType(LeaveType.valueOf(sc.next()));
		System.out.println("Enter Leave Reason  ");
		leaveHistory.setLeaveReason(sc.next());
		try {
			System.out.println(leaveHistoryDao.applyLeave(leaveHistory));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void searchEmployee() throws ClassNotFoundException, SQLException {
		int empId;
		System.out.println("Enter Employee Id  ");
		empId = sc.nextInt();
		Employee employee = employeeDao.searchByEmpId(empId);
		if (employee!=null) {
			System.out.println(employee);
		} else {
			System.out.println("*** Employee Record Not Found ***");
		}
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1. Employee Show");
			System.out.println("2. Employee Search ");
			System.out.println("3. Apply Leave");
			System.out.println("Enter Your Choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					employeeShow();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2 : 
				try {
					searchEmployee();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 : 
				try {
					applyLeave();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		} while(choice!= 8);
	}
}
