package com.tns.exceptionhandling;

public class ThrowExample {

	public static void validate(int age) {
		
		if(age<21 || age>27) {
			throw new ArithmeticException("Not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		try {
			validate(21);
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
}
