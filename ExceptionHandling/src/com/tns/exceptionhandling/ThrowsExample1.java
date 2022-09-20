package com.tns.exceptionhandling;

public class ThrowsExample1 {
	
	public static void myMethod(int num) {
		if(num==1)
			throw new ArithmeticException("num is equal to 1");
		else
			throw new ArrayIndexOutOfBoundsException("num is not equal to 1");
	}
	public static void main(String[] args) {
		try {
			myMethod(2);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
