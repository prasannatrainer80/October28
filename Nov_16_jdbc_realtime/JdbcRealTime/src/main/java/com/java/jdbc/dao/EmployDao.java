package com.java.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.jdbc.model.EmployNew;

public interface EmployDao {

	List<EmployNew> showEmployDao() throws ClassNotFoundException, SQLException;
	EmployNew searchEmploy(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(EmployNew employ) throws ClassNotFoundException, SQLException;
	String updateEmployDao(EmployNew employ) throws ClassNotFoundException, SQLException;
	String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException;
}
