package com.cg.thiskeyword;

class Demo{
	int i;
	void display() {
		System.out.println(this);
	}
}
public class Main {

	public static void main(String[] args) {
		
		Demo obj = new Demo();
		Demo obj1 = new Demo();
		System.out.println(obj);
		System.out.println(obj1);
		obj1.display();
		
	}

}
