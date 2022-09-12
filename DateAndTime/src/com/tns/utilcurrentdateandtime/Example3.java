package com.tns.utilcurrentdateandtime;

import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		
		Date d1 = new Date(97,10,27);
		Date d2 = new Date(97,6,12);
		System.out.println(d1);
		System.out.println(d2);
		
		int comparison = d1.compareTo(d2);
		int comparison2 = d2.compareTo(d1);
		int comparison3 = d1.compareTo(d1);
		System.out.println("d1 > d2 : " + comparison);
		System.out.println("d1 < d2 : " + comparison2);
		System.out.println("d1 = d1 : " + comparison3);
		
		boolean r1 = d1.equals(d2);
		System.out.println("Results of equal() r1 : " + r1);
		
		boolean r2 = d1.equals(d1);
		System.out.println("Results of equal() r2 : " + r2);
		
		long count1 = d1.getTime();
		long count2 = d1.getTime();
		System.out.println("Milliseconds of d1 : " + count1);
		System.out.println("Milliseconds of d2 : " + count2);
		
	}

}
