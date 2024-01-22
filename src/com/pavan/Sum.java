package com.pavan;

import java.util.Arrays;
import java.util.List;

public class Sum {
	public static void main(String[] args) {
		List<Integer> sum = Arrays.asList(1,2,3,4,5);
		int ans = sum.stream().reduce(0, (a, b)->a+b);
		System.out.println(ans);
	}

}
