package com.tns.exceptionhandling;

import java.io.IOException;

public class ThrowsExample {
	
	public static void myMethod(int num) throws Exception {
		if(num==1)
			throw new IOException("IOException Occured");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
	public static void main(String[] args) {
		try {
			myMethod(1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}		
}
