package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// ask the user to enter 2 numbers
		// ask the user to for operator (+,-,*,/)
		// calculate the result using if else
		
		// this is a change
		Scanner onur = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		double d1 = onur.nextDouble();
		
		System.out.println("Please enter the second number");
		double d2 = onur.nextDouble();
		
		System.out.println("Please enter the operator (+ - * /)");
		String operator = onur.next();
		
		if(operator.equals("+"))
		{
			System.out.println("The result is " + (d1 + d2));
		}
		else if(operator.equals("-"))
		{
			System.out.println("The result is " + (d1-d2));
		}
		else if(operator.equals("*"))
		{
			System.out.println("The result is " + (d1*d2));

		}
		else if(operator.equals("/"))
		{
			System.out.println("The result is " + (d1/d2));
		}
		else
		{
			System.out.println("Invalid operator");
		}
		
		
	}

}
