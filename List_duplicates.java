package com.pavan;

import java.util.Arrays;
import java.util.List;

public class List_duplicates {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,4,4,5,6,7,7);
		
		List<Integer> res = list.stream().distinct().toList();
		System.out.println(res);
	}

}
