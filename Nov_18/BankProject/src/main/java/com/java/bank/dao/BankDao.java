package com.java.bank.dao;

import java.sql.SQLException;

import com.java.bank.model.Bank;

public interface BankDao {

	String createAccount(Bank bank) throws ClassNotFoundException, SQLException;
	Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String updateAccount(int accountNo, String city, String state) throws ClassNotFoundException, SQLException;
}
