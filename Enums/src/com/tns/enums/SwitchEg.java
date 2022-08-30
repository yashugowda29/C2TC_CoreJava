package com.tns.enums;

public class SwitchEg {

	public static void main(String[] args) {
		
		Days d = Days.FRIDAY;
		
		switch(d)
		{
		case SUNDAY:
			System.out.println("Moving fwd to nxt week");
			break;
		case FRIDAY:
			System.out.println("Moving towards the weekends");
			break;
		}
	}

}
