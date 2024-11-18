package com.java.lms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.java.lms.model.Employee;
import com.java.lms.model.LeaveHistory;
import com.java.lms.model.LeaveStatus;
import com.java.lms.util.ConnectionHelper;

public class LeaveHistoryDaoImpl implements LeaveHistoryDao {

	Connection connection;
	PreparedStatement pst;
	
	public int tat(Date leaveStartDate, Date leaveEndDate) {
		long ms = leaveEndDate.getTime() - leaveStartDate.getTime();
		System.out.println(ms);
		long diff = ((ms) / (1000 * 60 * 60 * 24));
		System.out.println(diff);
		int days = (int)diff;
		System.out.println(days);
		days++;
		return days;
	}

	@Override
	public String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException {
		int diff;
		diff = tat(leaveHistory.getLeaveStartDate(), leaveHistory.getLeaveEndDate());
		int d1 = tat(new Date(), leaveHistory.getLeaveStartDate());
		int d2 = tat(new Date(), leaveHistory.getLeaveEndDate());
		Employee employee = new EmployeeDaoImpl().searchByEmpId(leaveHistory.getEmpId());
		int leaveAvail = employee.getEmpAvailLeaveBal();
		int balance = leaveAvail - diff;
		if (diff < 1) {
			return "Leave-Start Date must be greater than leaveEndDate..." +diff;
		} else if (d1 <= 1) {
			return "Leave Start Date cannot be Yesterday's Date... " +d1;
		} else if (d2 <= 1) {
			return "Leave End-Date Cannot be greater than Yesterdays' Date..."+d2;
		} else if (balance < 0) {
			return "Insufficient Leave Balance...";
		}
		leaveHistory.setLeaveStatus(LeaveStatus.PENDING);
		leaveHistory.setLeaveNoOfDays(diff);
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Leave_History(Emp_ID,Leave_Start_date,Leave_end_date,"
				+ "Leave_Type,Leave_Status,Leave_No_Of_Days,Leave_Reason) "
				+ " values(?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveHistory.getEmpId());
		pst.setDate(2, leaveHistory.getLeaveStartDate());
		pst.setDate(3, leaveHistory.getLeaveEndDate());
		pst.setString(4, leaveHistory.getLeaveType().toString());
		pst.setString(5, leaveHistory.getLeaveStatus().toString());
		pst.setInt(6, leaveHistory.getLeaveNoOfDays());
		pst.setString(7, leaveHistory.getLeaveReason());
		pst.executeUpdate();
		cmd = "Update Employee set EMP_AVAIL_LEAVE_BAL = EMP_AVAIL_LEAVE_BAL - ? "
				+ " WHERE EMP_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveHistory.getLeaveNoOfDays());
		pst.setInt(2, leaveHistory.getEmpId());
		pst.executeUpdate();
		// TODO Auto-generated method stub
		return "Leave Applied Successfully...";
	}
	
	
}
