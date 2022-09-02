package com.tns.abstractclass;

import com.tns.concreteclass.*;

public class Main {

	public static void main(String[] args) {
		
		RE obj = new RE();
		obj.clutch();
		obj.run();
		
		Bike b1 = new RE();
		b1.run();
		b1.clutch();
	
	}

}
