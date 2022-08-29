package com.tns.strings;

public class StringCompare {

	public static void main(String[] args) {
		
		String s1 = "Hello"; // String Literal
		String s2 = new String(s1); // Using new keyword
		
		System.out.println(s1 == s2); // F
		System.out.println(s1.contentEquals(s2)); // T
		
	}

}
