package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	public void bookProduct(float deliveryCharge) {
		System.out.println("Dear normal user,your product is booked,your charges are : " + getCharges() + "and delivery charges are : " + getDeliveryCharge());
	}
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getDeliveryCharge()=" + getDeliveryCharge()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}	
}
