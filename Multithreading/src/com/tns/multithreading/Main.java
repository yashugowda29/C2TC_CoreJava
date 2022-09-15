package com.tns.multithreading;

class Eclipse extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Ecliplse Thread Id is : " + Thread.currentThread().getId());
			try {
				sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);;
			}
		}
	}
}
public class Main {

	public static void main(String[] args) {
		
		Eclipse e = new Eclipse();
		e.start();
	}

}
