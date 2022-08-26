package com.cg.thiskeyword;

class Student {
	
	int id;
	String name;
	String college;
	
	public Student(int id, String name, String college) {
		//super();
		this.id = id;
		this.name = name;
		this.college = college;
	}	
	void display() {
		System.out.println(id + " " + name + " " + college);
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,"Yashaswini","RGIT");
		Student s2 = new Student(102,"Hithashree","RGIT");
		
		s1.display();
		s2.display();
	}

}
