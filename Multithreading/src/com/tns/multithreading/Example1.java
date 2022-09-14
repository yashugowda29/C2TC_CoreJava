package com.tns.multithreading;

class Eclipse extends Thread {
	public void run() {
		System.out.println("Eclipse Thread is running");
	}
}
class PPT extends Thread {
	public void run() {
		System.out.println("PPT Thread is running");
	}
}
public class Example1 {

	public static void main(String[] args) {
		
		Eclipse e = new Eclipse();
		e.start();
		PPT p = new PPT();
		p.start();
	}

}
