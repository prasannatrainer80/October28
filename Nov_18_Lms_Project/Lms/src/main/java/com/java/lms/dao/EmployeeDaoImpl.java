package com.java.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.lms.model.Employee;
import com.java.lms.util.ConnectionHelper;

public class EmployeeDaoImpl implements EmployeeDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Employee> showEmployDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee employee = null;
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public Employee searchByEmpId(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employee WHERE EMP_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobNo(rs.getString("EMP_MOB_NO"));
			employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
			employee.setEmpDept(rs.getString("EMP_DEPT"));
			employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
			employee.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
		}
		return employee;
	}

}
