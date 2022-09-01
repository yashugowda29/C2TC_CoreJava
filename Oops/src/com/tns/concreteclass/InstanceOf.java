package com.tns.concreteclass;

class Student {
	
}
class Yashaswini extends Student {
	
}

public class InstanceOf {

	public static void main(String[] args) {
		
		Yashaswini y = new Yashaswini();
		Student s = new Student();
		s = null;
		Student s1 = null;
		
		System.out.println(y instanceof Yashaswini); // T
		System.out.println(y instanceof Student); // T
		System.out.println(s instanceof Yashaswini); // F
		System.out.println(s instanceof Student); // F
		System.out.println(s1 instanceof Student); // F
	}

}
