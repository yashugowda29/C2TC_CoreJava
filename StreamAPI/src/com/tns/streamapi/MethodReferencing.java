package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class MethodReferencing {
	
	public static void doubleit(int i) {
		System.out.println(i*2);
	}

	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(1,2,3,4,5,6);
		//list.forEach(values -> System.out.println(values));
		
		//list.forEach(System.out :: println);
		list.forEach(MethodReferencing :: doubleit);
	}
}
