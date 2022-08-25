package com.cg.accesscontrol;

public class UsingStatic {
	
	public UsingStatic(){
		System.out.println("Using Static Constructor");
	}
	int varinstance; // non-static // Instance Variable
	static int varstatic; // static
	
	public void methodX() {
		varinstance=4;
		varstatic=5;
	}
	public static void main(String[] args) {
		varstatic=5;
		UsingStatic obj = new UsingStatic();
		obj.varinstance=4;
		System.out.println("The Instance Variable is : " + obj.varinstance);
		System.out.println("The Static variable is : " + obj.varstatic);
		
		obj.varinstance++; // 5
		obj.varstatic++; // 6
		System.out.println("After Incrementation");
		System.out.println("The Instance Variable is : " + obj.varinstance);
		System.out.println("The Static variable is : " + obj.varstatic);
		
		UsingStatic obj1 = new UsingStatic();
		obj1.varinstance++; // 1
		obj1.varstatic++; // 7
		System.out.println("Incrementation for Second Object");
		System.out.println("The Instance Variable is : " + obj1.varinstance);
		System.out.println("The Static variable is : " + obj1.varstatic);
	}

}
