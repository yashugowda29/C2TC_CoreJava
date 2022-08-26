package com.cg.thiskeyword;

class Testing {
	int data=10;
	Testing() {
		Training t2 = new Training();
		System.out.println("In testing constructor");
	}
}
class Training {
	void display() {
		System.out.println(data);
	}
}
public class ConstructorCall {

	public static void main(String[] args) {
		
		Testing t1 = new Testing();

	}

}
