package com.java.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.bank.model.Bank;
import com.java.bank.util.ConnectionHelper;

public class BankDaoImpl implements BankDao {

	Connection connection;
	PreparedStatement pst;
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) IS NULL THEN 1 else " 
				+ " max(accountNo)+1 end accno from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
	@Override
	public String createAccount(Bank bank) throws ClassNotFoundException, SQLException {
		int accno = generateAccountNo();
		bank.setAccountNo(accno);
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Bank(AccountNo, FirstName, LastName, City, State,"
				+ "Amount, CheqFacil,AccountType) values(?, ?, ?, ?, ?, ?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accno);
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setDouble(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		// TODO Auto-generated method stub
		return "Account Created with Account No " +accno;
	}
	@Override
	public Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Bank bank = null;
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Bank where AccountNo = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getDouble("Amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("AccountType"));
		}
		return bank;
	}
	@Override
	public String updateAccount(int accountNo, String city, String state) throws ClassNotFoundException, SQLException {
		Bank bankFound = searchAccount(accountNo);
		if (bankFound!=null) {
			String cmd = "Update Bank set city = ?, State = ? Where AccountNo = ?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, city);
			pst.setString(2, state);
			pst.setInt(3, accountNo);
			pst.executeUpdate();
			return "Account Updated...";
		}
		return "Account No Not Found...";
	}
}
