package com.pavan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetOrNot {
	public static void main(String[] args) {
		List<Integer> arr1 = Arrays.asList(11, 1, 13, 21, 3, 7);
		List<Integer> arr2 = Arrays.asList(11, 3, 7, 1);
		Collections.sort(arr1);
		Collections.sort(arr2);
		if(arr1.containsAll(arr2)) {
			System.out.println("subset");
		}else {
			System.out.println("not a subset");
		}
	}
}
