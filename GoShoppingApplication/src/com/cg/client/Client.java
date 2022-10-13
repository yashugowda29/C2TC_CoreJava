package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		
		ShopFactory sf = new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(101,"Yashu",7000,true);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		NormalAcc na = new GSNormalAcc(102,"Gowda",5000,50);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();		
	}
}
