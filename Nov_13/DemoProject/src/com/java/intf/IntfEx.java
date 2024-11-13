package com.java.intf;

interface ITraining {
	void name();
	void email();
}

class Dilip implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Dilip...");
	}

	@Override
	public void email() {
		System.out.println("Email is dilip@gmail.com");
	}
	
}

class Vignesh implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Vignesh...");
	}

	@Override
	public void email() {
		System.out.println("Email is vignesh@gmail.com");
	}
	
}

class Jansu implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Jansu...");
	}

	@Override
	public void email() {
		System.out.println("Email is jansu@gmail.com");
	}
	
}
public class IntfEx {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
				new Jansu(), new Vignesh(), 
				new Dilip()
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
