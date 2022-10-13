package com.cg.framework;

public abstract class CurrentAcc extends BankAcc{
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
	}
	public final float creditLimit = 100.0f;
	
	public float getCreditLimit() {
		return creditLimit;
	}
	public void withdraw(float creditLimit) {
		System.out.println("Credit Limit is : " + creditLimit);
	}
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
