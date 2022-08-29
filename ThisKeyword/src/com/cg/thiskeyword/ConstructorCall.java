package com.cg.thiskeyword;

class Testing {
	int data=10;
	Testing() {
		Training t2 = new Training(this);
		System.out.println("In testing constructor");
		t2.display();
	}
}
class Training {
	Testing obj;
	Training(Testing a){
		this.obj=a;
	}
	void display() {
		System.out.println(obj.data);
	}
}
public class ConstructorCall {

	public static void main(String[] args) {
		
		Testing t1 = new Testing();

	}

}
