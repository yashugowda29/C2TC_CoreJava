package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Limit {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);
		//list.forEach(System.out::println);
		list.stream().limit(4).forEach(System.out::println);
	}
}
