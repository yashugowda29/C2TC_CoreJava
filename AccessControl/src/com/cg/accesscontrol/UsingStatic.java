package com.cg.accesscontrol;

public class UsingStatic {
	
	public UsingStatic(){
		System.out.println("Using static Constructor");
	}
	int varinstance; // non-static // Instance Variable
	static int varstatic; // static
	
	public void methodX() {
		varinstance=4;
		varstatic=5;
	}
	public static void main(String[] args) {
		
		
	}

}
