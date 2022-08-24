package com.cg.statickeyword;

class Student1 {
	
	int id;
	String name;
	static String college="RGIT";
	static void change() {
		college="REVA";
	}

public static class Main {

	public static void main(String[] args) {
	
		Student1 s1 = new Student1();
		s1.id=101;
		s1.name="Yashaswini";
		//s1.college="RGIT";
		
		Student s2 = new Student();
		s1.id=102;
		s1.name="Hithashree";
		//s1.college="RGIT";
		
		Student1.change();
		System.out.println(s1.college);
		System.out.println(s2.college);


	}
}
}
