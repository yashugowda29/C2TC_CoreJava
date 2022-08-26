package com.cg.thiskeyword;

class Demonstration {
	void display(Demonstration d) {
		System.out.println("In display method");
	}
	void show() {
		System.out.println("In show method");
		display(this);
	}
}
public class MethodCall {

	public static void main(String[] args) {
		
		Demonstration d1 = new Demonstration();
		d1.show();
	}

}
