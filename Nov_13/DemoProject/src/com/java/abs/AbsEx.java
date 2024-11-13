package com.java.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Jashwanth extends Training {

	@Override
	void name() {
		System.out.println("Name is Jashwanth...");
	}

	@Override
	void email() {
		System.out.println("Email is jashwanth@gmail.com");
	}
	
}

class Pranav extends Training {

	@Override
	void name() {
		System.out.println("Name is Pranav...");
	}

	@Override
	void email() {
		System.out.println("Email is pranav@gmail.com");
	}
	
}

class Kayalvizi extends Training {

	@Override
	void name() {
		System.out.println("Name is Kayalvizi...");
	}

	@Override
	void email() {
		System.out.println("Email is kalayvizi@gmail.com");
	}
	
}
public class AbsEx {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Kayalvizi(), 
			new Pranav(),
			new Jashwanth()
		};
		
		for (Training training : arr) {
			training.name();
			training.email();
		}
	}
}
