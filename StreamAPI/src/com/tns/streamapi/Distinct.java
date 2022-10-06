package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(20,20,35,35,45,55,68,68,75);
		list.stream().distinct().forEach(System.out::println);
	}
}
