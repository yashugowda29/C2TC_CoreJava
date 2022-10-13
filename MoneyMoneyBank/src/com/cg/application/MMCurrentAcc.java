package com.cg.application;

import com.cg.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	public void withdraw(float creditLimit) {
		System.out.println("Dear current account user, you have withdrawn money, remaining balance is : " + getAccBal() + " and creditlimit is : " + getCreditLimit());
	}
	public String toString() {
		return "MMCurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
