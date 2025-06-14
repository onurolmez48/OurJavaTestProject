package com.neotech.review01;

public class VariableDemo {
	
	// ALWAYS FORMAT YOUR CODE
	// CTRL + SHİFT + F

	
	//TEST
	public static void main(String[] args) {
		
		// Declare a variable
		String firstName;
		
		// System.out.println("My name is -> " + firstName);
		
		// Assign a value (initialize)
		firstName = "Onur";
		
		System.out.println("My name is -> " + firstName);
		
		//Declare a variable & Assign a value
		String lastName = "Olmez";
		
		int age = 27;
		
		System.out.println(firstName + " " + lastName + " " + age + 1);
		System.out.println(firstName + " " + lastName + " " + (age + 1));
		
		System.out.println(age);
		
		// after 3 years
		// re-assign a new value to the container
		age += 3;
		lastName = "Pitt";
		
		System.out.println(firstName + " " + lastName + " " + age );
		
		
		
		
		
	}

}
