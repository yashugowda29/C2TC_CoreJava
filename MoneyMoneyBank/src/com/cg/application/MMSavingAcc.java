package com.cg.application;

import com.cg.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
	}
	private static final float MINBAL = 100.0f;
	
	public static float getMinbal() {
		return MINBAL;
	}
	public void withdraw(float accBal) {
		System.out.println("Dear saving account user, you have withdrawn money and remaining balance is : " + accBal);
	}
	public String toString() {
		return "MMSavingAcc [isSalary=" + isSalary + ", isSalary()=" + isSalary() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
