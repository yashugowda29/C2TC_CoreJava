package com.tns.strings;

public class SimpleString {

	public static void main(String[] args) {
		
		char c[] = {'j','a','v','a'};
		String s1 = new String(c);
		String s2 = new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
