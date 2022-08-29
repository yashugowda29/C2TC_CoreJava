package com.tns.strings;

public class Justify {

	public static void main(String[] args) {
		
		String str = "Study";
		String output = str.concat("Night");
		System.out.println(str);
		
		StringBuffer str1 = new StringBuffer("Study");
		str1.append("Night");
		System.out.println(str1);
		System.out.println(str1.capacity());
		
		StringBuffer str2 = new StringBuffer(10);
		System.out.println(str2.capacity());

	}

}
