package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
	
	public boolean isSalary;
	private static final float MINBAL = 0.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	public void withdraw(float accBal) {
		System.out.println("Balance is : " + accBal);
	}
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
}
