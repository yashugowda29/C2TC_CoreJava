package com.cg.demo;

public class Test1 {
	
	public int i;
	public void show() {
		System.out.println("In show method");
	}
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.i=10;
		t1.show();
		System.out.println(t1.i);
	}

}
