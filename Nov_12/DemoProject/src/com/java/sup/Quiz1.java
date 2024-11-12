package com.java.sup;

class Training {
	public void show() {
		System.out.println("General Training...");
	}
}

class JavaTraining extends Training {
	public void show() {
		System.out.println("Java Training from Prasanna...");
	}
}

class DotnetTraining extends Training {
	public void show() {
		System.out.println("Dotnet Training from Rajesh...");
	}
}

class SqlTraining extends Training {
	public void show() {
		System.out.println("Sql Training from Venkat P");
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		Training[] arr = new Training[] {
				new JavaTraining(), new DotnetTraining(), new SqlTraining(),
				new JavaTraining(), new SqlTraining(), new JavaTraining(),
				new SqlTraining(), new JavaTraining(), new JavaTraining()
		};
		
		for (Training t : arr) {
			if (t instanceof JavaTraining) {
				t.show();
			}
		}
	}
}
