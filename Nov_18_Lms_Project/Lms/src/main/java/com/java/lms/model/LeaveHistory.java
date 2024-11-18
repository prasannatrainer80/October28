package com.java.lms.model;

import java.sql.Date;

public class LeaveHistory {

	private int leaveId;
	private int leaveNoOfDays;
	private String leaveManagerComments;
	private int empId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private LeaveType leaveType;
	private LeaveStatus leaveStatus;
	private String leaveReason;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getLeaveNoOfDays() {
		return leaveNoOfDays;
	}
	public void setLeaveNoOfDays(int leaveNoOfDays) {
		this.leaveNoOfDays = leaveNoOfDays;
	}
	public String getLeaveManagerComments() {
		return leaveManagerComments;
	}
	public void setLeaveManagerComments(String leaveManagerComments) {
		this.leaveManagerComments = leaveManagerComments;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public LeaveType getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}
	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public LeaveHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveHistory(int leaveId, int leaveNoOfDays, String leaveManagerComments, int empId, Date leaveStartDate,
			Date leaveEndDate, LeaveType leaveType, LeaveStatus leaveStatus, String leaveReason) {
		super();
		this.leaveId = leaveId;
		this.leaveNoOfDays = leaveNoOfDays;
		this.leaveManagerComments = leaveManagerComments;
		this.empId = empId;
		this.leaveStartDate = leaveStartDate;
		this.leaveEndDate = leaveEndDate;
		this.leaveType = leaveType;
		this.leaveStatus = leaveStatus;
		this.leaveReason = leaveReason;
	}
	@Override
	public String toString() {
		return "LeaveHistory [leaveId=" + leaveId + ", leaveNoOfDays=" + leaveNoOfDays + ", leaveManagerComments="
				+ leaveManagerComments + ", empId=" + empId + ", leaveStartDate=" + leaveStartDate + ", leaveEndDate="
				+ leaveEndDate + ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus + ", leaveReason="
				+ leaveReason + "]";
	}
	
	
}
