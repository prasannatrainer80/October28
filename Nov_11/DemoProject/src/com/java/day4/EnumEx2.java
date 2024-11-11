package com.java.day4;

public class EnumEx2 {

	public static void main(String[] args) {
		Orders order1 = new Orders();
		order1.orderId = 1;
		order1.itemName = "Poha";
		order1.billAmount = 882.44;
		order1.orderStatus = OrderStatus.PENDING;
		
		Orders order2 = new Orders();
		order2.orderId = 2;
		order2.itemName = "ALU 65";
		order2.billAmount = 666.24;
		order2.orderStatus = OrderStatus.ACCEPTED;
		
		System.out.println(order1);
		System.out.println(order2);
	}
}
