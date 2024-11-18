package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;

public class UpdateAccountMain {

	public static void main(String[] args) {
		int accountNo;
		String state, city;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No, City and State  ");
		accountNo = sc.nextInt();
		city = sc.next();
		state = sc.next();
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.updateAccount(accountNo, city, state));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
