package com.java.employ.bal;

import java.util.List;

import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;

public class EmployBal {

	static EmployDao employDao;
	
	static StringBuilder sb;
	
	static {
		employDao = new EmployDaoImpl();
		sb = new StringBuilder();
	}
	
	public List<Employ> showEmployBal() {
		return employDao.showEmployDao();
	}
	
	public String addEmploy(Employ employ) throws EmployException {
		if (validateEmploy(employ)==true) {
			return employDao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public static boolean validateEmploy(Employ employ) {
		boolean flag = true;
		if (employ.getName().length() < 5) {
			sb.append("Employ No Must be greater than 5 characters...\n\r");
			flag = false;
		}
		if (employ.getDept().length() < 3) {
			sb.append("Employ Dept Contains Min. 3 characters...\r\n");
			flag = false;
		}
		if (employ.getBasic() < 10000 || employ.getBasic() > 80000) {
			sb.append("Employ Basic Must be between 10000 and 80000...\r\n");
			flag = false;
		}
		return flag;
	}
}
