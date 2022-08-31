package com.tns.wrapperclass;

public class UnBoxing {

	public static void main(String[] args) {
		
		Integer a = new Integer(3);
		
		int b = a.intValue(); // Older Version // Explicit
		int c = a; // Newer Version // Implicit
		
		System.out.println(a + " " + b + " " + c);
	}

}
