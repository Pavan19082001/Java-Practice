package com.pavan;

import java.util.Arrays;
import java.util.List;

public class Source {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(2,3,3,5,6,3,4,5);
		li.set(1, 6);
		System.out.println(li);
	}

}
