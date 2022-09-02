package com.tns.superkeyword;

class Animal {
	String color="Brown";
}
class Dog extends Animal {
	String color="White";
	
	void printcolor() {
		System.out.println(color); // White
		System.out.println(super.color); // Brown
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		System.out.println(d.color); // White
		d.printcolor();
		
	}

}
