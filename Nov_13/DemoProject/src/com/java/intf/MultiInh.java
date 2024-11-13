package com.java.intf;

interface IOne {
	void name();
}

interface ITwo {
	void email();
}

class Demo implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email from Demo class...");
	}

	@Override
	public void name() {
		System.out.println("From Demo Class...");
	}
	
}

public class MultiInh {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.name();
		demo.email();
	}
}
