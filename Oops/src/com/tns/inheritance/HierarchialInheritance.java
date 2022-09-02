package com.tns.inheritance;

import com.tns.classdetails.*;

public class HierarchialInheritance {

	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		
		Dog d = new Dog();
		d.eat();
		d.bark();
	}

}
