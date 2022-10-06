package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);//1,2,3,4,5,6=2,4,6,8,10,12=42
		
//		int result=0;
//		for(int i : list) {
//			result = result+i*2; //0+2=2//2+4=6//6+6=12
//		}
//		System.out.println(result);
		
		System.out.println(list.stream().map(i -> i*2).reduce(0,(c,e) ->(c+e)));
	}
}
