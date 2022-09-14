package com.tns.multithreading;

class Eclipse1 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("Eclipse Thread is running");
		System.out.println("Eclipse Thread Id is : " + Thread.currentThread().getId());
		System.out.println("Eclipse Thread Priority is : " + Thread.currentThread().getPriority());
		System.out.println("Eclipse Thread Name is : " + Thread.currentThread().getName());
	}
}
class PPT1 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("PPT Thread is running");
		System.out.println("PPT Thread Id is : " + Thread.currentThread().getId());
		System.out.println("PPT Thread Priority is : " + Thread.currentThread().getPriority());
		System.out.println("Eclipse Thread Name is : " + Thread.currentThread().getName());
	}
}
public class Example2 {

	public static void main(String[] args) {
		
		Eclipse1 e = new Eclipse1();
		Thread obj = new Thread(e);
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		
		PPT1 p = new PPT1();
		Thread obj1 = new Thread(p);
		obj1.start();
		obj1.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println("Main Thread Id is : " + Thread.currentThread().getId());
		System.out.println("Main Thread Name is : " + Thread.currentThread().getName());
	}

}
