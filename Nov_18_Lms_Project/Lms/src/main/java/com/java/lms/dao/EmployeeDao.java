package com.java.lms.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.lms.model.Employee;

public interface EmployeeDao {

	List<Employee> showEmployDao() throws ClassNotFoundException, SQLException;
	Employee searchByEmpId(int empId) throws ClassNotFoundException, SQLException;
}
