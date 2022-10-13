package com.cg.application;

import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
	private static final float Charges = 20.0f;
	
	public void bookProduct(float charges) {
		System.out.println("Dear prime user, your product is booked and charges are :" + charges);
	}
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}	
}
