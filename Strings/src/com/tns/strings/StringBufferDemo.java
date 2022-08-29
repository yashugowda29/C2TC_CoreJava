package com.tns.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Hello");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.capacity());
		
		String s;
		int a=42;
		StringBuffer str1 = new StringBuffer(a);
		s = str1.append("a is : ").append(a).append("!").toString();
		System.out.println(s);
	}

}
