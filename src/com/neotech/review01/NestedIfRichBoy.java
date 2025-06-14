package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRichBoy {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your gender: (m/f)");
		char gender = input.next().charAt(0);
		
		System.out.println("Are you rich? true/false");
		boolean rich = input.nextBoolean();
		
		if(gender == 'm' || gender == 'M')
		{
			System.out.println("Yaay, lts a boy");
			// we have a boy
			if(rich)
			{
				System.out.println("buy a ferrari");
			}
			else 
			{
				System.out.println("Play soccer");
			}
		}
		else if(gender == 'f' || gender == 'F')
		{
			System.out.println("oh noo. its a girl!");
			//we have a girl
			if(rich)
			{
				System.out.println("Buy a LV bag");
			}
			else
			{
				System.out.println("Read a book");
			}
		}
		else
		{
			System.out.println("Invalid gender!");
		}
	}

}
