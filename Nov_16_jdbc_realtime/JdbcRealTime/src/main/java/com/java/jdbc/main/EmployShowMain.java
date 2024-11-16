package com.java.jdbc.main;

import java.sql.SQLException;
import java.util.List;

import com.java.jdbc.dao.EmployDao;
import com.java.jdbc.dao.EmployDaoImpl;
import com.java.jdbc.model.EmployNew;

public class EmployShowMain {
	public static void main(String[] args) {
		EmployDao employDao = new EmployDaoImpl();
		try {
			List<EmployNew> employList = employDao.showEmployDao();
			for (EmployNew employ : employList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
