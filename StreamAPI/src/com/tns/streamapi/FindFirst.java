package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);//20,35,55,75//20*2=40
		
//		int result=0;
//		for(int i : list) {
//			if(i%5==0) {
//				result = i*2;//40
//				break;
//			}
//		}
//		System.out.println(result);
		
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());
	}
}
