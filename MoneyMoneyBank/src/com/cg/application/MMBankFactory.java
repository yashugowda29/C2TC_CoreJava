package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory {
	
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return mmsaving;
	}
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return mmcurrent;
	}

}
