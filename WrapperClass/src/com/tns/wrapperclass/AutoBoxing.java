package com.tns.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		
		int a=5; // Primitive way
		Integer b = Integer.valueOf(a); // Older Version // Explicit
		Integer c = a; // Newer Version // Implicit
		
		System.out.println(a + " " + b + " " + c);
	}

}
