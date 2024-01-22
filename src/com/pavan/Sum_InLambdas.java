package com.pavan;

import java.util.Arrays;
import java.util.List;

public class Sum_InLambdas {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,7,8,4,21);
		Integer res = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(res);
	}
}
