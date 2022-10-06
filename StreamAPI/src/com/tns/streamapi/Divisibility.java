package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;

public class Divisibility {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,20,35,46,55,68,75);//20,35,55,75//185
		
//		int result=0;
//		for(int i : list) {
//			if(i%5==0) {
//				result = result+i*2;//0+20=20//20+35=55//55+55=110//110+75=185
//			}
//		}
//		System.out.println(result);
		
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).reduce(0,Integer::sum));
	}
}
