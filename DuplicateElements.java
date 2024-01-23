package com.pavan;

import java.util.*;

public class DuplicateElements {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 2, 3, 5, 3, 7, 9, 5, 3, 7 };
		Arrays.sort(arr, new FrequencyComparator(arr));

		for (Integer i : arr) {
			System.out.print(i + " ");
		}
	}

	static class FrequencyComparator implements Comparator<Integer> {

		HashMap<Integer, Integer> map = new HashMap<>();

		public FrequencyComparator(Integer[] arr) {
			for (Integer i : arr) {
				if (map.containsKey(i)) {
					int count = map.get(i); 
					map.put(i, count + 1);  
				} else {
					map.put(i, 1);
				}
			}
		}

		@Override
		public int compare(Integer o1, Integer o2) {
			if (map.get(o1) < map.get(o2))
				return 1;
			else if (map.get(o1) > map.get(o2))
				return -1;
			else
				return o1.compareTo(o2);
		}

	}

}
