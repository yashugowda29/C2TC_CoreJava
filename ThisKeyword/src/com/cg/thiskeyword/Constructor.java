package com.cg.thiskeyword;

class Test {
	
	Test() {
		this(5);
		System.out.println("User defined non-parameter constructor");
	}
	Test(int x) {
		this(12,34);
		System.out.println("X value is : " + x);
	}
	Test(int x, int y) {
		System.out.println("X and Y value is : " + x + " " + y);
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		Test t1 = new Test();

	}

}
