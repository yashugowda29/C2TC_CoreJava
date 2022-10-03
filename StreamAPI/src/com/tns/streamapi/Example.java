package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(1,2,3,4,5,6);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Before removing:" +list);
		list.remove(1);
		System.out.println("After removing:" +list);
	}

}
