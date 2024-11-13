package com.java.abs;

abstract class Flight {
	abstract void idProof();
	abstract void ticket();
}

class Varshini extends Flight {

	@Override
	void idProof() {
		System.out.println("Varshini is having Driving Liscence as Id Proof...");
	}

	@Override
	void ticket() {
		System.out.println("Varshini is traveeling through first class ticket...");
	}
	
}

class Sarath extends Flight {

	@Override
	void idProof() {
		System.out.println("Sarath is having Aadhar As Id proof...");
	}

	@Override
	void ticket() {
		System.out.println("Sarath is having Economy class as Ticket...");
	}
	
}

class Archana extends Flight {

	@Override
	void idProof() {
		System.out.println("Archana is having Passport as Id Proof...");
	}

	@Override
	void ticket() {
		System.out.println("Archana is having Business Class Ticket for Flight...");
	}
	
}

public class AbsEx2 {
	public static void main(String[] args) {
		Flight[] arr = new Flight[] {
			new Archana(), new Sarath(), new Varshini()	
		};
		for (Flight flight : arr) {
			flight.idProof();
			flight.ticket();
		}
	}
}
