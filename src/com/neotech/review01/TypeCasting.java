package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		
		// byte < short < int < long < float < double
		
		//This is a change
		int intNumber = 39;
		
		// widening / implicit casting / automatically
		double doubleNumber = intNumber;
		
		System.out.println("intNumber --> " + intNumber);
		System.out.println("doubleNumber --> " + doubleNumber);
		
		// narrowing / explicit casting / manually
		byte byteNumber = (byte) intNumber; // we may lose data
		System.out.println("byteNumber --> " + byteNumber);
		
		// re-assign
		intNumber = 300;
		
		// in this case we will lose data
		byte b2 = (byte) intNumber;
		System.out.println(b2); // 44
		
		byte b3 = 80;
		int i3 = b3;
		System.out.println(i3);
		
		
		double d1 = 7.9;
		int i4 = (int) d1;
		System.out.println(i4);
		
	}

}
