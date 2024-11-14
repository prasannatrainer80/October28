package com.java.day6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {

	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Jashwanth", "Tiruveedhula");
		userData.put("Jyothika", "Sujith");
		userData.put("Raj", "Senthil");
		userData.put("Sundhara", "Pandi");
		userData.put("Dilip", "Krishnan");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName and Password  ");
		user = sc.next();
		pwd = sc.next();
		String res;
		res = userData.getOrDefault(user, "Not Found");
		if (pwd.equals(res)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
