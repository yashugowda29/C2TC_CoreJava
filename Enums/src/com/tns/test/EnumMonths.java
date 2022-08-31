package com.tns.test;

enum Months {
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), 
	MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), 
	OCTOBER(31), NOVEMBER(30), DECEMBER(31);
	
	int days;

	Months(int days) {
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
}
public class EnumMonths {

	public static void main(String[] args) {
		
//		System.out.println(Months.values());
//		System.out.println(Months.APRIL.values());
//		for(Months m : Months.values()) {
//			System.out.println(m + " " + m.values());
			
		System.out.println(Months.JANUARY.getDays());
		System.out.println(Months.SEPTEMBER.getDays());
		
	}

}
