package com.tns.test;

enum Choice {
	choice1,choice2,choice3
}
public class SwitchEnum {

	public static void main(String[] args) {
		
		Choice c = Choice.choice3;
		
		switch(c) {
		case choice1:
			System.out.println("My choice is choice1");
			break;
		case choice2:
			System.out.println("My choice is choice2");
			break;
			
		default:
			System.out.println("I have not selected anything from the available choice");
			break;
		}
		
	}

}
