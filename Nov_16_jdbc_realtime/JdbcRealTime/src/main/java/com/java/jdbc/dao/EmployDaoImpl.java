package com.java.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.jdbc.model.EmployNew;
import com.java.jdbc.model.Gender;
import com.java.jdbc.util.ConnectionHelper;

public class EmployDaoImpl implements EmployDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<EmployNew> showEmployDao() throws ClassNotFoundException, SQLException {
		EmployNew employ = null;
		List<EmployNew> employList = new ArrayList<EmployNew>();
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from EmployNew";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			employ = new EmployNew();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public EmployNew searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		EmployNew employ = null;
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from EmployNew where empno = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			employ = new EmployNew();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}

	@Override
	public String addEmployDao(EmployNew employ) throws ClassNotFoundException, SQLException {
		String cmd = "Insert into EmployNew(empno,name,gender,dept,desig,basic) "
				+ " values(?, ?, ?, ?, ?, ?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender().toString());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setDouble(6, employ.getBasic());
		pst.executeUpdate();
		return "Employ Record Inserted...";
	}

	@Override
	public String updateEmployDao(EmployNew employ) throws ClassNotFoundException, SQLException {
		EmployNew employFound = searchEmploy(employ.getEmpno());
		if (employFound !=null) {
			String cmd = "Update EmployNew set Name = ?, Gender = ?, Dept = ?, Desig = ?, "
					+ " Basic = ? Where Empno = ?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, employ.getName());
			pst.setString(2, employ.getGender().toString());
			pst.setString(3, employ.getDept());
			pst.setString(4, employ.getDesig());
			pst.setDouble(5, employ.getBasic());
			pst.setInt(6, employ.getEmpno());
			pst.executeUpdate();
			return "Employ Record Updated...";
		}
		return "Employ Record Not Found...";
	}

	@Override
	public String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException {
		EmployNew employFound = searchEmploy(empno);
		if (employFound !=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "delete from EmployNew where empno = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Employ Record Deleted...";
		}
		return "Employ Record Not Found...";
	}

}
