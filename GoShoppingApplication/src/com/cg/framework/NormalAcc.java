package com.cg.framework;

public abstract class NormalAcc extends ShopAcc{
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
	}
	private final float deliveryCharge = 50.0f;
	
	public float getDeliveryCharge() {
		return deliveryCharge;
	}
	public void bookProduct(float deliveryCharge) {
		System.out.println("Charges are : " + deliveryCharge);
	}
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
