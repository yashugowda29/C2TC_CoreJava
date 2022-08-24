package com.cg.statickeyword;

public class Student {
	
	int id;
	String name;
	static String college="RGIT";

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.id=101;
		s1.name="Yashaswini";
		//s1.college="RGIT";
		
		Student s2 = new Student();
		s1.id=102;
		s1.name="Hithashree";
		//s1.college="RGIT";
		
		System.out.println(s1.college);
		System.out.println(s2.college);


	}

}
