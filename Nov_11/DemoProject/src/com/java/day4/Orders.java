package com.java.day4;

public class Orders {

	int orderId;
	String itemName;
	double billAmount;
	OrderStatus orderStatus;
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", itemName=" + itemName + ", billAmount=" + billAmount + ", orderStatus="
				+ orderStatus + "]";
	}
	
}
