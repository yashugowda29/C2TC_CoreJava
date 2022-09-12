package com.tns.utilcurrentdateandtime;

import java.util.Date;

public class Example1 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.toString());
		d1.setTime(2345678);
		System.out.println(d1);
		System.out.println(d1.getTime());
		System.out.println(d1.hashCode()); // 2345678
	}

}
