package com.tns.superkeyword;

class Animall {
	void eat() {
		System.out.println("Eating");
	}
}
class Cat extends Animall {
	void eat() {
		System.out.println("Eating Bread");
	}
	void meow() {
		System.out.println("Meowing");
	}
	void work() {
		meow();
		eat();
		super.eat();
	}
}
public class Method {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.eat();
	}

}
