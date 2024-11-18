package com.java.lms.dao;

import java.sql.SQLException;

import com.java.lms.model.LeaveHistory;

public interface LeaveHistoryDao {
	String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException;
}
