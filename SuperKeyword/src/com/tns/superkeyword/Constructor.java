package com.tns.superkeyword;

class Bike {
	Bike() {
		System.out.println("Bike is created");
	}
}
class RE extends Bike {
	RE() {
		super();
		System.out.println("RE constructor is called");
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		RE obj = new RE();
	}

}
