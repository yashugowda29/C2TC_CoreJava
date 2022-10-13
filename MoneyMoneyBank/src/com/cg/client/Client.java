package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
		BankFactory bf = new MMBankFactory();
		
		SavingAcc sa = new MMSavingAcc(1,"Yashu",10000,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentAcc ca = new MMCurrentAcc(2,"Ishuu",5000,100);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}
}
